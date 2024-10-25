import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        InventoryChecker inventoryChecker = new InventoryChecker();
        DiscountCalculator discountCalculator = new DiscountCalculator();

        CheckoutMediator mediator = new CheckoutMediator(orderProcessor, paymentProcessor, inventoryChecker, discountCalculator);


        for (;;){
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Введите id машины, для выхода введите ''");
            String carId = scanner.nextLine();

            if (carId.equals("")){
                break;
            }

            System.out.println("Введите стоимость заказа");
            double totalAmount = scanner.nextDouble();

            Order order = new Order(carId, totalAmount);


            mediator.checkout(order);
            System.out.println("\n------------------------------\n");
        }
        
    }
}
