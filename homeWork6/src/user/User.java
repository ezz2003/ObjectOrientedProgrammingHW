package user;
/*
класс содержит поля - данные пользователя
 */
public class User implements IUser{
    private String name;
    private String login;
    private String password;
    private boolean isLogged = false;

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public void setIsLogged(boolean logged) {
        this.isLogged = logged;
    }
    @Override
    public String getName() {
        return isLogged ? name : "name";
    }
    @Override
    public String getLogin() {
        return login;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public boolean getIsLogged() {
        return isLogged;
    }
}
