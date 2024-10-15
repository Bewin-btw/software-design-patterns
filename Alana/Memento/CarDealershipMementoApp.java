package Memento;

import Memento.CarConfigurator;
import Memento.ConfigHistoryManager;

public class CarDealershipMementoApp {
    public static void main(String[] args) {
        CarConfigurator configurator = new CarConfigurator();
        ConfigHistoryManager manager = new ConfigHistoryManager();

        configurator.setConfiguration("Sport Package");
        manager.saveConfiguration(configurator);

        configurator.setConfiguration("Luxury Package");
        manager.restoreConfiguration(configurator);
    }
}