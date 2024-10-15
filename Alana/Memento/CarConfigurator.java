package Memento;

import Memento.CarConfigMemento;

public class CarConfigurator {
    private String configuration;

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
        System.out.println("Configuration set to: " + configuration);
    }

    public String getConfiguration() {
        return configuration;
    }

    public CarConfigMemento save() {
        System.out.println("Configuration saved.");
        return new CarConfigMemento(configuration);
    }

    public void restore(CarConfigMemento memento) {
        configuration = memento.getConfiguration();
        System.out.println("Configuration restored to: " + configuration);
    }
}