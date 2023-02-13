import exceptions.BadFormatAuthentificationDataException;
import exceptions.NullAuthentificationDataException;
import entity.User;

public class Main {

    public static void main(String[] args) {
        User user = new User("", "admin1234");

        try {
            if (user.authenticateUser()) {
                System.out.println("Hello Root !");
            } else {
                System.err.println("Authentication Failed !!");
            }
        } catch (NullAuthentificationDataException | BadFormatAuthentificationDataException e) {
            System.err.println(e.getMessage());
        }
    }
}
