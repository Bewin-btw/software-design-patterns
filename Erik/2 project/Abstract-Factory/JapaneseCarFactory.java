public class JapaneseCarFactory implements CarFactory {
    @Override
    public SteeringWheel createSteeringWheel() {
        return new JapaneseSteeringWheel();
    }

    @Override
    public Body createBody() {
        return new JapaneseBody();
    }
}
