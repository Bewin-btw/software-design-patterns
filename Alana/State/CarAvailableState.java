package State;


public class CarAvailableState implements CarAvailabilityState {
    @Override
    public void handleRequest() {
        System.out.println("Car is available for purchase.");
    }
}
