package Memento;

import Memento.CarConfigMemento;
import Memento.CarConfigurator;

public class ConfigHistoryManager {
    private CarConfigMemento memento;

    public void saveConfiguration(CarConfigurator configurator) {
        memento = configurator.save();
    }

    public void restoreConfiguration(CarConfigurator configurator) {
        if (memento != null) {
            configurator.restore(memento);
        } else {
            System.out.println("No configuration saved.");
        }
    }
}
