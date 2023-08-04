package userPresenter;

import user.IUser;
import user.User;
import userView.*;


public class UserPresenter {
    private IUser user;
    private View view;

    public UserPresenter(User user, View view) {
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

    public void logIn() {
        if (view.logInForm(user.getLogin(), user.getPassword())) {
            user.setIsLogged(true);
            view.showString("you are logged");
            showUser();
        } else {
            view.showString("invalid username or password");
        }
    }

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

    public void changePassword() {
        if (user.getIsLogged()) {
            user.setPassword(view.changePasswordForm(user.getPassword()));
        }
    }
}
