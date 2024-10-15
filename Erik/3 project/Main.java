import chainofresponsibility.*;
import observer.*;

public class Main {
    public static void main(String[] args) {
        // Chain of Responsibility Example
        DiscountHandler sales = new SalesDiscountHandler();
        DiscountHandler manager = new ManagerDiscountHandler();
        DiscountHandler director = new DirectorDiscountHandler();

        sales.setNextHandler(manager);
        manager.setNextHandler(director);

        System.out.println("Handling Discounts:");
        sales.handleDiscount(4);
        sales.handleDiscount(10);
        sales.handleDiscount(20);

        // Observer Example
        System.out.println("\nCar Availability Notifications:");
        CarAvailability carAvailability = new CarAvailability();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        carAvailability.addObserver(customer1);
        carAvailability.addObserver(customer2);

        carAvailability.setCarModel("Tesla Model S");
    }
}