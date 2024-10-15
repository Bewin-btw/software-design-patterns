public class AmericanCarFactory implements CarFactory {
    @Override
    public SteeringWheel createSteeringWheel() {
        return new AmericanSteeringWheel();
    }

    @Override
    public Body createBody() {
        return new AmericanBody();
    }
}
