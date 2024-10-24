package Aruzhan.Strategy;
import java.util.Scanner;
import java.util.HashSet;

public class VIPCustomerPricing implements PricingStrategy {
    private HashSet<String> validVIPIds;

    public VIPCustomerPricing(HashSet<String> validVIPIds) {
        this.validVIPIds = validVIPIds;
    }

    @Override
    public double calculatePrice(Car car) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your VIP ID:");
            String vipId = scanner.nextLine();

            if (validVIPIds.contains(vipId)) {
                System.out.println("Valid VIP ID. Applying 10% discount.");
                return car.getBasePrice() * 0.9;
            } else {
                System.out.println("Invalid VIP ID. No discount applied.");
                return car.getBasePrice();
            }
        }
    }
}
