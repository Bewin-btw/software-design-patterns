package Aruzhan.Strategy;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(50000);

        // Define valid VIP IDs and promo codes
        HashSet<String> validVIPIds = new HashSet<>();
        validVIPIds.add("VIP123");
        validVIPIds.add("VIP456");
        validVIPIds.add("VIP789");

        HashSet<String> validPromoCodes = new HashSet<>();
        validPromoCodes.add("Newyear");
        validPromoCodes.add("BlackFriday");
        validPromoCodes.add("Christmas");
        validPromoCodes.add("Easter");
        validPromoCodes.add("SummerSale");

        CarStore store = new CarStore(new RegularCustomerPricing());

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Select pricing strategy: regular, vip, or discount");
            String userInput = scanner.nextLine();

            switch (userInput.toLowerCase()) {
                case "regular":
                    store.changeStrategy(new RegularCustomerPricing());
                    break;
                case "vip":
                    store.changeStrategy(new VIPCustomerPricing(validVIPIds));
                    break;
                case "discount":
                    store.changeStrategy(new SeasonalDiscountPricing(validPromoCodes));
                    break;
                default:
                    System.out.println("Invalid input, using regular pricing by default.");
                    store.changeStrategy(new RegularCustomerPricing());
            }
        }
        double price = store.calculatePrice(car);
        System.out.println("Final price: " + price);
    }
}