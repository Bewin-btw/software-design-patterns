package Aruzhan.Strategy;
import java.util.Scanner;
import java.util.HashSet;

public class SeasonalDiscountPricing implements PricingStrategy {
    private HashSet<String> validPromoCodes;

    public SeasonalDiscountPricing(HashSet<String> validPromoCodes) {
        this.validPromoCodes = validPromoCodes;
    }

    @Override
    public double calculatePrice(Car car) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter promo code:");
            String promoCode = scanner.nextLine();

            if (validPromoCodes.contains(promoCode)) {
                System.out.println("Valid promo code. Applying 20% discount.");
                return car.getBasePrice() * 0.8;
            } else {
                System.out.println("Invalid promo code. No discount applied.");
                return car.getBasePrice();
            }
        }
    }
}
