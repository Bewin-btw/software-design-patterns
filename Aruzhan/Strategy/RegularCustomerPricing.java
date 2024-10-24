package Aruzhan.Strategy;

public class RegularCustomerPricing implements PricingStrategy {
    @Override
    public double calculatePrice(Car car) {
        return car.getBasePrice();
    }
}