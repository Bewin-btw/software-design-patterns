

public abstract class PaymentProcessor {
    public final void processPayment() {
        validatePaymentDetails();
        processTransaction();
        sendReceipt();
    }

    protected abstract void validatePaymentDetails();
    protected abstract void processTransaction();

    protected void sendReceipt() {
        System.out.println("Receipt sent to the customer.");
    }
}
