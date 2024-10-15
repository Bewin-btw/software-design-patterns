package State;

public class Car2 {
    private CarAvailabilityState state;

    public Car2() {
        state = new CarAvailableState(); // Начальное состояние - доступно
    }

    public void setState(CarAvailabilityState state) {
        this.state = state;
    }

    public void handleRequest() {
        state.handleRequest();
    }
}
