package calcPresenter;

import calcView.View;
import complexNumber.ComplexNumber;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
класс для создания запроса на проведение
математичесой операции над комплексными числами
 */
public class PresenterMakeRequest implements IPresenterMakeRequest{

    View view;
    Logger logger;

    public PresenterMakeRequest(View view, Logger logger) {
        this.view = view;
        this.logger = logger;
    }

    /**
     * запрашивает у пользователя 2 комплексных
     * числа, знак математической операции над ними
     * и формирует запрос на совершение математической операции
     * @return PresenterRequest - запрос
     * @throws IOException
     */
    public PresenterRequest presenterMakeRequest() throws IOException {

        PresenterRequest presenterRequest = new PresenterRequest();

        view.showSampleComplexNumbers();
        view.showString("First enter A and B of the 1st number, then enter A and B of the 2nd number\n");
        float[]c1 = new float[2];
        float[]c2 = new float[2];
        try {
            c1 = view.getFloatForm();
            c2 = view.getFloatForm();
        }catch (IOException e){
            logger.log(Level.INFO, "Invalid type");
            throw e;
        }
        ComplexNumber complexNumber1 = new ComplexNumber(c1[0], c1[1]);
        ComplexNumber complexNumber2 = new ComplexNumber(c2[0], c2[1]);
        presenterRequest.setComplexNumber1(complexNumber1);
        presenterRequest.setComplexNumber2(complexNumber2);
        view.showRequest("acion ");
        char operation = view.getCharForm();
        presenterRequest.setOperation(operation);
        logger.log(Level.INFO, "Request created");
        return presenterRequest;
    }
}
