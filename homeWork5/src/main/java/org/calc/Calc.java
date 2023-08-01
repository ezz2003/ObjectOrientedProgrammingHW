package org.calc;

public class Calc {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        presenter.onAddButtonClicked();

    }
}
