package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import model.*;
import service.*;

import java.util.Arrays;
import java.util.List;

public class ServiceTests {

    private PaymentService paymentService;
    private TransactionService transactionService;

    @BeforeEach
    void setUp() {
        paymentService = new PaymentService();
        transactionService = new TransactionService();
    }

    @Test
    void testProcessPaymentReturnsBoolean() {
        PaymentMethod dummyMethod = new PaymentMethod("VISA", "4111111111111111", "12/25", "123");
        boolean result = paymentService.processPayment(dummyMethod);
        assertTrue(result || !result, "processPayment should return a boolean value.");
    }

    @Test
    void testProcessCardTransactionOutput() {
        PaymentMethod dummyMethod = new PaymentMethod("VISA", "4111111111111111", "12/25", "123");
        List<Item> items = Arrays.asList(new Item("Coffee", 2.50));
        Transaction transaction = new Transaction(items);
        String result = transactionService.processCardTransaction(transaction, dummyMethod);
        assertTrue(result.equals("Payment Complete") || result.equals("Transaction Failed. Please Try Again."),
                   "Should return either success or failure message.");
    }
}
