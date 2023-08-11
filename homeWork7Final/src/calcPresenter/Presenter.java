package calcPresenter;

import calcView.IView;
import calcView.View;
import complexNumber.Actions;
import complexNumber.ComplexNumber;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
Класс Presenter обеспечивает связь между View и ComplexNumber (Model)
 */
public class Presenter implements IPresenter,  IView {
    View view;
    Actions actions;
    PresenterMakeRequest presenterMakeRequest;
    PresenterRequest presenterRequest;
    Logger logger;
    public Presenter(View view, Actions actions, PresenterMakeRequest presenterMakeRequest,
                     PresenterRequest presenterRequest, Logger logger) {
       this.view = view;
       this.actions = actions;
       this.presenterMakeRequest = presenterMakeRequest;
       this.presenterRequest = presenterRequest;
       this.logger = logger;
    }

    public void add() {
        actions.add();
        logger.log(Level.INFO, "Addressing the class Action(add)");
    }

    public void sub() {
        actions.sub();
    }

    public void mult(){ actions.mult();}

    public void div(){
        actions.div();
    }

    public void setComplexNumber1(ComplexNumber complexNumber1) {
        actions.setComplexNumber1(complexNumber1);
    }

    public void setComplexNumber2(ComplexNumber complexNumber2) {
        actions.setComplexNumber2(complexNumber2);
    }

    public ComplexNumber getComplexNumber3() {
        return actions.getComplexNumber3();
    }

    public PresenterRequest presenterMakeRequest() throws IOException {
        return presenterMakeRequest.presenterMakeRequest();
    }

    @Override
    public float[] getFloatForm() throws IOException {
        return view.getFloatForm();
    }

    @Override
    public char getCharForm() {
        return view.getCharForm();
    }

    @Override
    public void showRequest(String text) {
        view.showRequest(text);
    }

    @Override
    public void showSampleComplexNumbers() {
        view.showSampleComplexNumbers();
    }

    @Override
    public void showString(String text) {
        view.showString(text);
    }

    @Override
    public void showComplexNumber(ComplexNumber complexNumber){
        view.showComplexNumber(complexNumber.getA(), complexNumber.getB());
    }
}
