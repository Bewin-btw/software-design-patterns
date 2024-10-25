public class CheckoutMediator {
    private OrderProcessor orderProcessor;
    private PaymentProcessor paymentProcessor;
    private InventoryChecker inventoryChecker;
    private DiscountCalculator discountCalculator;

    public CheckoutMediator(OrderProcessor orderProcessor, PaymentProcessor paymentProcessor,
                            InventoryChecker inventoryChecker, DiscountCalculator discountCalculator) {
        this.orderProcessor = orderProcessor;
        this.paymentProcessor = paymentProcessor;
        this.inventoryChecker = inventoryChecker;
        this.discountCalculator = discountCalculator;
    }

    public boolean checkout(Order order) {
        orderProcessor.createOrder(order);

        if (!inventoryChecker.isInStock(order.getCarId())) {
            System.out.println("Автомобиль не в наличии.");
            return false;
        }

        double discount = discountCalculator.calculateDiscount(order);
        order.applyDiscount(discount);

        if (!paymentProcessor.processPayment(order)) {
            System.out.println("Платёж не прошел.");
            return false;
        }

        orderProcessor.confirmOrder(order);
        System.out.println("Заказ успешно оформлен.");
        return true;
    }
}
