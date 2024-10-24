package Command;
import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandManager commandManager = new CommandManager();

        System.out.println("Choose a car brand:");
        String model = scanner.nextLine();

        System.out.println("Choose the color of the car:");
        String color = scanner.nextLine();
        Car3 myCar = new Car3(model, color);

        while (true) {
            System.out.println("Enter the command (order, undo, exit): ");
            String input = scanner.nextLine();

            switch (input) {
                case "order":
                    commandManager.executeCommand(new OrderCommand(myCar));
                    break;

                case "undo":
                    commandManager.undoLastCommand();
                    break;

                case "exit":
                    System.out.println("Exit the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("The wrong command. Try again.");
            }
        }
    }
}
