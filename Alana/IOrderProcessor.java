public interface IOrderProcessor {
    void createOrder(Order order);
    boolean processPayment(String orderId, double amount);
}
