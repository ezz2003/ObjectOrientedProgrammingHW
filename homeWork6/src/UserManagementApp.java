import user.IUser;
import user.User;
import userPresenter.UserPresenter;
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


    public static void main(String[] args) {
        User user = new User();
        IViewBase register = new ViewRegister();                    //  1 •	S: Single Responsibility Principle
                                                                    // каждый класс решает одну задачу (вместо методов
                                                                    // - классы. Класс делает 1 действие)

        IViewBase changePassw = new ViewChangePassw();              //  3 •	L: Liskov Substitution Principle
                                                                    // создание разных классов от одного общего
        IViewBase logIn = new ViewLogIn();                          //
        View view = new View(register, changePassw, logIn);         //  4 • I: Interface Segregation Principle
                                                                    // клиент вполне может что - либо из интерфейсов
                                                                    // не использовать, либо использовать напрямую
        UserPresenter presenter = new UserPresenter(user, view);

        onAddButtonClicked(presenter);
    }
}
