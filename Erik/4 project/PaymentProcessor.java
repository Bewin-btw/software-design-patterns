public class PaymentProcessor {
    public boolean processPayment(Order order) {
        System.out.println("Обработка платежа на сумму: " + order.getTotalAmount());
        // Логика обработки платежа
        return true; // Предположим, что платеж успешен
    }
}
