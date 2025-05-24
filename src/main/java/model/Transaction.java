package model;

import java.util.List;

public class Transaction {
    private List<Item> items;
    private String status;
    private PaymentMethod paymentMethod;

    public Transaction(List<Item> items) {
        this.items = items;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentDetails(PaymentMethod method, String status) {
        this.paymentMethod = method;
        this.status = status;
    }

    public void markComplete() {
        this.status = "COMPLETE";
    }

    public String getStatus() {
        return status;
    }

    public List<Item> getItems() {
        return items;
    }
}
