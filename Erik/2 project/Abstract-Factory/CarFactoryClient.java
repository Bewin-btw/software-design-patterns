public class CarFactoryClient {
    private SteeringWheel steeringWheel;
    private Body body;

    public CarFactoryClient(CarFactory factory) {
        this.steeringWheel = factory.createSteeringWheel();
        this.body = factory.createBody();
    }

    public void assembleCar() {
        steeringWheel.steer();
        body.getBodyType();
    }

    public static void main(String[] args) {
        // Создаем автомобиль на Американской фабрике
        CarFactory americanFactory = new AmericanCarFactory();
        CarFactoryClient americanCar = new CarFactoryClient(americanFactory);
        americanCar.assembleCar();
        System.out.println();

        // Создаем автомобиль на Японской фабрике
        CarFactory japaneseFactory = new JapaneseCarFactory();
        CarFactoryClient japaneseCar = new CarFactoryClient(japaneseFactory);
        japaneseCar.assembleCar();
    }
}
