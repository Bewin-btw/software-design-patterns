package State;

public class CarReservedState implements CarAvailabilityState {
    @Override
    public void handleRequest() {
        System.out.println("Car is reserved. Awaiting confirmation.");
    }
}
