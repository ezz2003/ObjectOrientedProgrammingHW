package userPresenter;

import user.IUser;
import user.User;
import userView.View;
/*
Заполненение полей в User: получение данных из View -> изменение статуса в User
 */
public class PresenterRegisterUser implements IPresenterBase, IPresenterRegisterUser {

    private User user;
    private View view;

    public PresenterRegisterUser(User user, View view) {
        this.user = user;
        this.view = view;
    }

    public void registerUser() {
        String[] regData = this.view.registerForm();           // registerForm()
        user.setName(regData[0]);
        user.setLogin(regData[1]);
        user.setPassword(regData[2]);
        user.setIsLogged(true);
    }
}
