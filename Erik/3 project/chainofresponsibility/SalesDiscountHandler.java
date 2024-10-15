package chainofresponsibility;

public class SalesDiscountHandler extends DiscountHandler {
    @Override
    public void handleDiscount(double discount) {
        if (discount <= 5) {
            System.out.println("Sales team approved a discount of: " + discount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleDiscount(discount);
        }
    }
}