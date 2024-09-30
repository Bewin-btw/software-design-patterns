public interface IAuthProvider {
    void register(User user);
    boolean login(String username, String password);
    boolean validatePassword(User user, String password);
}
