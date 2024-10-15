import java.util.ArrayList;
import java.util.List;

public class LocalAuthProvider implements IAuthProvider {
    private List<User> users = new ArrayList<>();

    @Override
    public void register(User user) {
        System.out.println("Registering user: " + user.getUsername());
        users.add(user);
    }

    @Override
    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return validatePassword(user, password);
            }
        }
        System.out.println("User not found");
        return false;
    }

    @Override
    public boolean validatePassword(User user, String password) {
        if (user.getHashedPassword().equals("hashed_" + password)) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("Invalid password");
            return false;
        }
    }
}
