public class TemplateMethodDemo {
    public static void main(String[] args) {
        System.out.println("Processing PayPal payment:");
        PaymentProcessor payPalPayment = new PayPalPaymentProcessor();
        payPalPayment.processPayment();

        System.out.println("\nProcessing Credit Card payment:");
        PaymentProcessor creditCardPayment = new CreditCardPaymentProcessor();
        creditCardPayment.processPayment();
    }
}
