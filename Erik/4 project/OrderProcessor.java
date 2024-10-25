public class OrderProcessor {
    public void createOrder(Order order) {
        System.out.println("Создание заказа с ID: " + order.getOrderId());
    }

    public void confirmOrder(Order order) {
        System.out.println("Заказ с ID: " + order.getOrderId() + " подтвержден.");
        order.setConfirmed(true);
    }
}
