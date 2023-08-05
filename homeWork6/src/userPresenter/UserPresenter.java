package userPresenter;

/*
Класс для управления методами взаимодействия между Viue и User. Для расширения приложения класс подлежит дополнению
 */
public  class UserPresenter implements IPresenter{
    private IPresenterRegisterUser registerUser;
    private IPresenterLogIn logIn;
    private IPresenterShowUser showUser;
    private IPresenterChangePassword changePassword;

    public UserPresenter(IPresenterRegisterUser registerUser, IPresenterLogIn logIn, IPresenterShowUser showUser, IPresenterChangePassword changePassword) {
        this.registerUser = registerUser;
        this.logIn = logIn;
        this.showUser = showUser;
        this.changePassword = changePassword;
    }


    @Override
    public void changePassword() {
        changePassword.changePassword();
    }

    @Override
    public void logIn() {
        logIn.logIn();
    }

    @Override
    public void registerUser() {
        registerUser.registerUser();
    }

    @Override
    public void showUser() {
        showUser.showUser();
    }
}
