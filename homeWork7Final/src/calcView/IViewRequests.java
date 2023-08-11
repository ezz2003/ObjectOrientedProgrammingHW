package calcView;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public interface IViewRequests extends IViewBase{
    /**
     * метод предлагает по очереди ввести
     * действительную и мнимую часть
     * комплексного числа (тип float),
     * запрашивает их у пользователя
     * и помещает в массив
     * @return Array из двух чисел типа float
     * @throws IOException
     */
    default float[] getFloatForm() throws IOException {
        ViewShows viewShows = new ViewShows();
        float [] cNumber = new float[2];
        Scanner scanner = new Scanner(System.in);
        viewShows.showString("A: ");
        cNumber[0] = scanner.nextFloat();
        viewShows.showString("B: ");
        cNumber[1] = scanner.nextFloat();
        return cNumber;
    }

    /**
     * принимает от пользователя символ
     * @return символ (char)
     */
    default char getCharForm() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
