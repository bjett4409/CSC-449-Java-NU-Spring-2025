public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
    public Product getProduct() {
        return product;
    }
    public void increaseQuantity(int amount) {
        this.quantity += amount;
    }
}
