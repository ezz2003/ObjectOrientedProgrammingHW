package user;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserView {

    public void showRequest(String text) {
        System.out.print("Enter " + text + ": ");
    }

    public void showString(String text) {
        System.out.println(text);
    }

    public String[] registerForm() {
        String[] regData = new String[3];
        showRequest("Name");
        regData[0] = getUserString();
        showRequest("Login");
        regData[1] = getUserString();
        showRequest("Password");
        regData[2] = getUserString();
        return regData;
    }

    public boolean logInForm(String login, String password) {
        showRequest("Login");
        boolean x = getUserString().equals(login);
        showRequest("Password");
        return x && getUserString().equals(password);
    }

    public String changePasswordForm(String passw) {
        showString("old Password: " + passw);
        showRequest("Password");
        return getUserString();
    }

    public String getUserString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
