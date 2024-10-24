package Command;
public class OrderCommand implements Command {
    private Car3 car;

    public OrderCommand(Car3 car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("Order for the car " + car.getModel() + " in color " + car.getColor() + " has been placed!");
    }
}