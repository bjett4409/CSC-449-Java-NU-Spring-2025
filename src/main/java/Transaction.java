public class Transaction {
    private boolean isComplete;
    private String paymentMethod;
    private String paymentStatus;

    public Transaction(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pending";
        this.isComplete = false;
    }

    public void completeTransaction() {
        this.isComplete = true;
        this.paymentStatus = "Paid";
    }

    public void markComplete() {
        this.isComplete = true;
        this.paymentStatus = "Paid";
    }

    public void setPaymentDetails(PaymentMethod method, String status) {
        this.paymentMethod = method.name();       // Safely converts enum to string
        this.paymentStatus = status.toUpperCase();
    }

    public boolean isComplete() {
        return isComplete;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
