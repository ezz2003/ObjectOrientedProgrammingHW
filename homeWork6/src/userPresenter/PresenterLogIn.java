package userPresenter;

import user.User;
import userView.View;
/*
регистрация пользователя: получение данных из View -> изменение статуса в User
 */
public class PresenterLogIn implements IPresenterLogIn, IPresenterBase {
    User user;
    View view;
    public PresenterLogIn(User user, View view) {

        this.user = user;
        this.view = view;
    }

    public void logIn() {
        if (view.logInForm(user.getLogin(), user.getPassword())) {
            user.setIsLogged(true);
            view.showString("you are logged");
//            showUser();
        } else {
            view.showString("invalid username or password");
        }
    }
}
