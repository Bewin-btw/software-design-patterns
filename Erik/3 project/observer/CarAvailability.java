package observer;

public class CarAvailability extends Subject {
    private String carModel;

    public void setCarModel(String carModel) {
        this.carModel = carModel;
        System.out.println(carModel + " is now available.");
        notifyObservers(carModel);
    }
}
