public class Car implements CarPrototype {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public CarPrototype clone() {
        return new Car(this.model, this.color);
    }

    public void printDetails() {
        System.out.println("Car model: " + model + ", color: " + color);
    }
}
