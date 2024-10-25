package observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String carModel) {
        System.out.println("Customer " + name + " notified: " + carModel + " is now available.");
    }
}
