package calcView;

public interface IViewShows extends IViewBase{
    /**
     * Выводит в консоль предложение
     * ввести значение
     * @param text
     */
    default void showRequest(String text) {
        System.out.print("Enter " + text + ": \n");
    }

    /**
     * Выводит в консоль пример
     * алгебраического представления
     * комплексного числа
     */
    default void showSampleComplexNumbers(){
        System.out.println("\nСomplex numbers have the form: A + Bi");
    }

    /**
     * Выводит в консоль строку
     * без перевода строки в конце строки
     * @param text
     */
    default void showString(String text) {
        System.out.print(text);
    }

    /**
     * Выводит в консоль комплексное число
     * в алгебраической форме
     * @param a float действительная часть комплексного числа
     * @param b float мнимая часть комплексного числа
     */
    default void showComplexNumber(float a, float b){
        System.out.printf("%.2f + %.2fi", a, b);
    }

}
