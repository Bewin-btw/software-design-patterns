public class Main {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        creditCard.processPayment(100.0);
        
        Payment paypal = new PayPalPayment(); // Добавьте этот код
        paypal.processPayment(150.0); // Используйте PayPal для обработки платежа
    }
}
