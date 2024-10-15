public class CreditCardPaymentProcessor extends PaymentProcessor {

    @Override
    protected void validatePaymentDetails() {
        System.out.println("Validating credit card details.");
    }

    @Override
    protected void processTransaction() {
        System.out.println("Processing payment through credit card.");
    }
}
