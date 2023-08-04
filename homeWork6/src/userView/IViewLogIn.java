package userView;

public interface IViewLogIn extends IViewBase{
   /**
    * форма запроса логина и пароля,
    * запрос логина и пароля для регистрации
    * @param login
    * @param password
    * @return
    */
   public default boolean logInForm(String login, String password) {
      showRequest("Login");
      boolean x = getUserStringForm().equals(login);
      showRequest("Password");
      return x && getUserStringForm().equals(password);
   }
}
