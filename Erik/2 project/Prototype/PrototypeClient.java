public class PrototypeClient {
    public static void main(String[] args) {
        // Создаем исходный объект автомобиля
        Car originalCar = new Car("Sedan", "Red");
        originalCar.printDetails();

        // Клонируем оригинальный автомобиль
        Car clonedCar = (Car) originalCar.clone();
        clonedCar.printDetails();

        // Изменяем характеристики клонированного автомобиля
        clonedCar = new Car("SUV", "Black");
        clonedCar.printDetails();
    }
}
