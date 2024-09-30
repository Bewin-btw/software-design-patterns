public class Main {
    public static void main(String[] args) {
        IAuthProvider authProvider = new LocalAuthProvider();

        User newUser = new User("Dima", "345");
        authProvider.register(newUser);

        authProvider.login("Kostya", "123");
        authProvider.login("Dima", "345");
    }
}
