public class Order {
    private static int nextOrderId = 1; // Статическое поле для автоинкрементирования ID заказа, по идее,
    // это проблема, но мы можем отсылать данные заказа в бд на каком-то этапе, но опять же асинхронщина сломает все(( но who cares
    private String orderId;
    private String carId;
    private double totalAmount;
    private boolean isConfirmed;

    public Order(String carId, double totalAmount) {
        this.orderId = generateOrderId();
        this.carId = carId;
        this.totalAmount = totalAmount;
        this.isConfirmed = false;
    }

    private String generateOrderId() {
        return "" + nextOrderId++; // Генерация ID с автоинкрементом
    }

    public String getOrderId() { return orderId; }
    public String getCarId() { return carId; }
    public double getTotalAmount() { return totalAmount; }
    public boolean isConfirmed() { return isConfirmed; }

    public void applyDiscount(double discount) {
        totalAmount -= discount;
        System.out.println("Применена скидка. Итоговая сумма: " + totalAmount);
    }

    public void setConfirmed(boolean confirmed) {
        this.isConfirmed = confirmed;
    }
}
