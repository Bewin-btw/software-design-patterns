package State;

public class CarSoldState implements CarAvailabilityState {
    @Override
    public void handleRequest() {
        System.out.println("Car has been sold.");
    }
}
