import java.util.HashMap;
import java.util.Map;

public class OnlineOrderProcessor implements IOrderProcessor {
    private Map<String, Order> orders = new HashMap<>();

    @Override
    public void createOrder(Order order) {
        System.out.println("Creating order: " + order.getOrderId());
        orders.put(order.getOrderId(), order);
    }

    @Override
    public boolean processPayment(String orderId, double amount) {
        Order order = orders.get(orderId);
        if (order != null && amount >= order.getTotalAmount()) {
            order.setPaid(true);
            System.out.println("Payment successful for order: " + order.getOrderId());
            return true;
        } else {
            System.out.println("Payment failed for order: " + orderId);
            return false;
        }
    }
}
