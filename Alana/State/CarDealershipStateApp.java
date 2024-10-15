package State;

//Основной класс
public class CarDealershipStateApp {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.handleRequest(); //Показать, что автомобиль доступен

        //Изменить состояние автомобиля
        car.setState(new CarReservedState());
        car.handleRequest(); // Показать, что автомобиль зарезервирован

        //Изменить состояние автомобиля
        car.setState(new CarSoldState());
        car.handleRequest(); //Показать, что автомобиль продан
    }
}
