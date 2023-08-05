import user.IUser;
import user.User;
import userPresenter.*;
import userView.*;

import java.util.Scanner;

public class UserManagementApp {

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void onAddButtonClicked(UserPresenter presenter) {
        boolean x = true;
        while (x) {
            System.out.println("Choose: [1] - register a user, [2] - show user, [3] - log in, " +
                    "[4] - change Password, [0] - EXIT");
            int choice = getUserChoice();
            switch (choice) {
                case 1:
                    presenter.registerUser();
                    break;
                case 2:
                    presenter.showUser();
                    break;
                case 3:
                    presenter.logIn();
                    break;
                case 4:
                    presenter.changePassword();
                    break;
                case 0:
                    x = !x;
                    break;
                default:
                    System.out.println("Please enter the correct command");
            }
        }
    }

    public static void main(String[] args) {                        // 2. •	O: Open-Closed Principle - соблюдается,
                                                                    // как во View, так и в Presenter.
                                                                    // изменение наследованием = изменение функционала
                                                                    // действий с USER или других категорий USER.
                                                                    // дописать другие классы "по образцу и подобию" =
                                                                    // расширить функционал работы с USER/
                                                                    // Не справедливо только для ViewRegister.
                                                                    // Для соответствия - нужен новый другой User
                                                                    // и изменение функционала и типа возвращаемых
                                                                    //  данных в ViewRegister.
        User user = new User();
        IViewBase register = new ViewRegister();                    //  1 •	S: Single Responsibility Principle
                                                                    // каждый класс решает одну задачу (вместо методов
                                                                    // - классы. Класс делает 1 действие)

        IViewBase changePassw = new ViewChangePassw();              //  3 •	L: Liskov Substitution Principle
                                                                    // создание разных классов от одного общего
        IViewBase logIn = new ViewLogIn();                          // - полностью выполняется только во View, а в
                                                                    // Presenter - только классы действий - от одного
                                                                    // общего интерфейса, но экземпляры от него
                                                                    // не создаются.
        View view = new View(register, changePassw, logIn);         //  4 • I: Interface Segregation Principle
                                                                    // клиент вполне может что - либо из интерфейсов
                                                                    // не использовать, либо использовать напрямую
        IPresenterRegisterUser presenterRegister = new PresenterRegisterUser(user, view);
                                                                    // 5 •D: Dependency Inversion Principle
                                                                    // во View выполняется полностью, в Presenter -
                                                                    // меньше, можно считать, что не выполняется вовсе.
        IPresenterLogIn presenterLogIn =  new PresenterLogIn(user, view);
        IPresenterShowUser presenterShowUser =  new PresenterShowUser(user, view);
        IPresenterChangePassword presenterChangePassword = new PresenterChangePassword(user, view);
        UserPresenter presenter = new UserPresenter(presenterRegister, presenterLogIn,
                presenterShowUser, presenterChangePassword);

//        presenterChangePassword.changePassword();
        onAddButtonClicked(presenter);
    }
}
