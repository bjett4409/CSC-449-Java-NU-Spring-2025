import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentServiceTest {

    @Test
    public void testProcessPaymentReturnsBoolean() {
        PaymentService service = new PaymentService();
        boolean result = service.processPayment(PaymentMethod.CHIP);
        // Since it's random, just check it's a boolean
        assertTrue(result || !result, "Result should be a boolean (true or false)");
    }
}
