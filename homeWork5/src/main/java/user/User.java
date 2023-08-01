package user;

public class User {
    private String name;
    private String login;
    private String password;
    private boolean isLogged = false;


    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsLogged(boolean logged) {
        this.isLogged = logged;
    }

    public String getName() {
        return isLogged ? name : "name";
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean getIsLogged() {
        return isLogged;
    }
}
