package Command;
import java.util.ArrayList;
import java.util.List;
class CommandManager {
    private List<Command> commandHistory = new ArrayList<>();

    public void executeCommand(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            commandHistory.remove(commandHistory.size() - 1);
            System.out.println("The last action has been canceled.");
        } else {
            System.out.println("There are no commands to cancel.");
        }
    }
}
