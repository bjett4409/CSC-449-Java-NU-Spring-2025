package model;

public class PaymentMethod {
    private String type;
    private String cardNumber;
    private String expiry;
    private String cvv;

    public PaymentMethod(String type, String cardNumber, String expiry, String cvv) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvv = cvv;
    }

    // Getters
    public String getType() { return type; }
    public String getCardNumber() { return cardNumber; }
    public String getExpiry() { return expiry; }
    public String getCvv() { return cvv; }
}
