package user;

public interface IUser {

    void setName(String name);

    void setLogin(String login);

    void setPassword(String password);

    void setIsLogged(boolean logged);

    String getName();

    String getLogin();

    String getPassword();

    boolean getIsLogged();

}
