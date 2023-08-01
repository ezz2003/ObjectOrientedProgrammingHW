package user;

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
        UserView view = new UserView();
        User user = new User();
        UserPresenter presenter = new UserPresenter(user, view);

        onAddButtonClicked(presenter);
    }
}
