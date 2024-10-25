package chainofresponsibility;

public class DirectorDiscountHandler extends DiscountHandler {
    @Override
    public void handleDiscount(double discount) {
        if (discount > 15) {
            System.out.println("Director approved a discount of: " + discount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleDiscount(discount);
        }
    }
}
