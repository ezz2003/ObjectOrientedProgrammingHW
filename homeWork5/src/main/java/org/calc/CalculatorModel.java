package org.calc;

public class CalculatorModel {
    private float result;
    private void sum(float value1, float value2) {
        result = value1 + value2;
    }
    public void sub(float value1, float value2) {
        result = value1 - value2;
    }
    public void div(float value1, float value2) {
        if (value2 != 0) {
            result = value1 / value2;
        } else {
            throw new IllegalArgumentException("Делить на ноль нельзя!");
        }
    }
    public void mult(float value1, float value2) {
        result = value1 * value2;
    }

    public boolean calculate(float num1, float num2, char ch) {
        switch (ch) {
            case '+':
                sum(num1, num2);
                return true;
            case '-':
                sub(num1, num2);
                return true;
            case '*':
                mult(num1, num2);
                return true;
            case '/':
                div(num1, num2);
                return true;
            default:
                return false;
        }
    }
    public float getResult() {
        return result;
    }
}

