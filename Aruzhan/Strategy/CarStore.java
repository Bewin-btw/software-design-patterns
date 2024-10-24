package Aruzhan.Strategy;

public class CarStore {
    private PricingStrategy strategy;

    public CarStore(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculatePrice(Car car) {
        return strategy.calculatePrice(car);
    }
}
