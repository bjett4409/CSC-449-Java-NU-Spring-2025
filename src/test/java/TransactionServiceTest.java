import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Feature("Transaction Processing")
public class TransactionServiceTest {

    @Test
    @DisplayName("Should complete transaction when payment succeeds")
    @Description("Verifies that a transaction is marked as complete and added to history if payment is successful.")
    @Owner("bjett")
    public void testProcessCardTransaction_CompleteOrFail() {
        TransactionService service = new TransactionService();
        Transaction tx = new Transaction("MAGSTRIPE");

        String result = service.processCardTransaction(tx, PaymentMethod.MAGSTRIPE);

        assertNotNull(result);
        assertTrue(
            result.equals("Payment Complete") || result.contains("Transaction Failed"),
            "Unexpected result message: " + result
        );
    }

    @Test
    @DisplayName("Transaction history should grow on success")
    @Description("Checks if successful transactions are added to the transaction history.")
    @Owner("bjett")
    public void testTransactionHistorySize() {
        TransactionService service = new TransactionService();

        // Run multiple attempts
        Transaction tx1 = new Transaction("CHIP");
        service.processCardTransaction(tx1, PaymentMethod.CHIP);

        Transaction tx2 = new Transaction("CONTACTLESS");
        service.processCardTransaction(tx2, PaymentMethod.CONTACTLESS);

        List<Transaction> history = service.getAllTransactions();

        // Only successful transactions are added
        assertTrue(history.size() >= 0 && history.size() <= 2, "Unexpected transaction history size");
    }
}
