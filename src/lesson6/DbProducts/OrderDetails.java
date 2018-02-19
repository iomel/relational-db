package lesson6.DbProducts;

public class OrderDetails {
    private Order order;
    private Product product;
    private double unitPrice;
    private int quantity;
    private int discount;

    public OrderDetails(Order order, Product product, double unitPrice, int quantity, int discount) {
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}
