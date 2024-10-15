package Memento;

public class CarConfigMemento {
    private final String configuration;

    public CarConfigMemento(String configuration) {
        this.configuration = configuration;
    }

    public String getConfiguration() {
        return configuration;
    }
}