package userView;

import java.util.Scanner;

public interface IViewBase {
    /**
     * возвращает строку, введенную с клавиатуры пользователем
     * @return String строка, введённая пользователем
     */
    default public String getUserStringForm() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    default public void showRequest(String text) {
        System.out.print("Enter " + text + ": ");
    }

    default public void showString(String text) {
        System.out.println(text);
    }
}

