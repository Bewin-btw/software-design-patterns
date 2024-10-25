public class DiscountCalculator {
    public double calculateDiscount(Order order) {
        // Применение скидки
        System.out.println("Расчет скидки для заказа с ID: " + order.getOrderId());
        return 0.1 * order.getTotalAmount(); // Например, 10% скидка
    }
}
