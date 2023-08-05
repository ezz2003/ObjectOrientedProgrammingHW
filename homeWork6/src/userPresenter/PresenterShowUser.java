package userPresenter;

import user.IUser;
import user.User;
import userView.View;
/*
Печать в консоль полей User
 */
public class PresenterShowUser implements IPresenterBase, IPresenterShowUser {
    private IUser user;
    private View view;
    public PresenterShowUser(IUser user, View view) {
        this.user = user;
        this.view = view;
    }

    /**
     * Собирает строку из полей User,
     * и, с помощью View, выводит
     * строку в консоль
     */
    public void showUser() {
        String out;
        if (user.getIsLogged()) {
            out = String.format("Name: %s, Login: %s, Password: %s.",
                    user.getName(), user.getLogin(), user.getPassword());
        } else {
            out = "first, register or log in";
        }
        view.showString(out);
    }
}
