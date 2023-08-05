package userPresenter;

import user.IUser;
import user.User;
import userView.View;
/*
Изменение поля password в User: получение данных из View -> при наличии статуса поля
                                isLogged=true -> изменение содержимого password в User
 */
public class PresenterChangePassword implements IPresenterChangePassword, IPresenterBase {
    User user;
    View view;
    public PresenterChangePassword(User user, View view) {

        this.user = user;
        this.view = view;
    }

    /**
     * если в поле isLogged объекта User TRUE,
     * запрашивается новый пароль и передаётся
     * в User.password
     */
    public void changePassword() {
        if (user.getIsLogged()) {
            user.setPassword(view.changePasswordForm(user.getPassword()));
        }
    }
}
