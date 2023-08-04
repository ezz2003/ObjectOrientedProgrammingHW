package userPresenter;

import user.IUser;
import userView.View;

public class PresenterRegisterUser {
    private IUser user;
    private View view;

    public PresenterRegisterUser(IUser user, View view) {
        this.user = user;
        this.view = view;
    }

    public void registerUser() {
        String[] regData = view.registerForm();           // registerForm()
        user.setName(regData[0]);
        user.setLogin(regData[1]);
        user.setPassword(regData[2]);
        user.setIsLogged(true);
    }
}
