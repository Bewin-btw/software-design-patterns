public class PayPalPaymentProcessor extends PaymentProcessor {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating PayPal account details.");
    }

    @Override
    protected void processTransaction() {
        System.out.println("Processing payment through PayPal.");
    }
}

