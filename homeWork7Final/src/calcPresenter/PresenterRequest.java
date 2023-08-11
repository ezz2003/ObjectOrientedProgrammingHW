package calcPresenter;

import calcView.View;
import complexNumber.ComplexNumber;

/*
класс - запрос на проведение математической операции
над двумя комплексными числами: 2 комплексных числа и
знак математического действия
 */
public class PresenterRequest implements IPresenterRequest{
    ComplexNumber complexNumber1;
    ComplexNumber complexNumber2;
    char operation;

    public PresenterRequest() {
    }

    private PresenterRequest(ComplexNumber complexNumber1, ComplexNumber complexNumber2, char operation) {
        this.complexNumber1 = complexNumber1;
        this.complexNumber2 = complexNumber2;
        this.operation = operation;

    }

    public void setComplexNumber1(ComplexNumber complexNumber1) {
        this.complexNumber1 = complexNumber1;
    }

    public void setComplexNumber2(ComplexNumber complexNumber2) {
        this.complexNumber2 = complexNumber2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public ComplexNumber getComplexNumber2() {
        return complexNumber2;
    }

    public char getOperation() {
        return operation;
    }

    public ComplexNumber getComplexNumber1() {
        return complexNumber1;
    }


}
