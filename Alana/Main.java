public class Main {
    public static void main(String[] args) {
        IOrderProcessor orderProcessor = new OnlineOrderProcessor();

        Order order1 = new Order("123", 99.99);
        orderProcessor.createOrder(order1);

        Order order2 = new Order("456", 49.99);
        orderProcessor.createOrder(order2);

        orderProcessor.processPayment("123", 99.99);  // Успешная оплата
        orderProcessor.processPayment("456", 30.00);  // Ошибка при оплате
    }
}
