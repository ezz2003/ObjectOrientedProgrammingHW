package org.calc;

public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;


    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {

        float number1 = view.getUserInput();
        float number2 = view.getUserInput();
        char operation = view.userOperation();

        boolean ans = model.calculate(number1, number2, operation);
        if (ans){
            float result = model.getResult();
            view.displayResult(result);
        } else {
            view.displayOperationErr(operation);
            onAddButtonClicked();
        }




    }
}

