package lesson7;

public class User extends Store{
    String login;
    String password;
    
    public User() {
        login = "";
        password = "";
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
