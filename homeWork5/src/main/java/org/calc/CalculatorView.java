package org.calc;

import java.util.Scanner;

public class CalculatorView {
    public void displayResult(float result) {
        System.out.println("Результат: " + result);
    }

    public void displayOperationErr(char op){
        System.out.printf("Введено неверное действие %s\nпопробуйте снова:\n", op);
    }

    public float getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        float input = scanner.nextFloat();
        return input;
    }
    public char userOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите операцию: [+ - * /]");
        return scanner.next().charAt(0);
    }
}

