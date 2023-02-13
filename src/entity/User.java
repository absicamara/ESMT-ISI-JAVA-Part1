package entity;

import exceptions.BadFormatAuthentificationDataException;
import exceptions.NullAuthentificationDataException;

public class User {
    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean authenticateUser() throws NullAuthentificationDataException, BadFormatAuthentificationDataException {
        if (login == null || password == null) {
            throw new NullAuthentificationDataException("Login and password sould be provided");
        } else {
            if (login.length() < 3 || password.length() < 4) {
                throw new BadFormatAuthentificationDataException("Login must be at 3 characters at least and the password needs 4 at least.");
            }
        }
        return login.equals("root") && password.equals("admin1234");
    }
}
