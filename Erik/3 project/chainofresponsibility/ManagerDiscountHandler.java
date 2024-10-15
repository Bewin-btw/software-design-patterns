package chainofresponsibility;

public class ManagerDiscountHandler extends DiscountHandler {
    @Override
    public void handleDiscount(double discount) {
        if (discount > 5 && discount <= 15) {
            System.out.println("Manager approved a discount of: " + discount + "%");
        } else if (nextHandler != null) {
            nextHandler.handleDiscount(discount);
        }
    }
}