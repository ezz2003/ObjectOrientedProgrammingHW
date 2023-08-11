import calcPresenter.Presenter;
import calcPresenter.PresenterMakeRequest;
import calcPresenter.PresenterRequest;
import calcView.*;
import complexNumber.*;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ComplexCalcManagementApp {
    private final static Logger logger = Logger.getLogger(ComplexCalcManagementApp.class.getName());

    /**
     * обрабатывает запрос PresenerRequest
     * в зависимости от поля operatin запроса
     * @param presenter
     * @throws IOException
     */
    public static void onAddButtonClicked(Presenter presenter) throws IOException {
        boolean x = true;
        while (x) {
            PresenterRequest request = presenter.presenterMakeRequest();

            char choice = request.getOperation();
            ComplexNumber answer;
            switch (choice) {
                case '+':
                    presenter.setComplexNumber1(request.getComplexNumber1());
                    presenter.setComplexNumber2(request.getComplexNumber2());
                    presenter.add();
                    answer = presenter.getComplexNumber3();
                    presenter.showComplexNumber(answer);
                    break;
                case '-':
                    presenter.setComplexNumber1(request.getComplexNumber1());
                    presenter.setComplexNumber2(request.getComplexNumber2());
                    presenter.sub();
                    answer = presenter.getComplexNumber3();
                    presenter.showComplexNumber(answer);
                    break;
                case '*':
                    presenter.setComplexNumber1(request.getComplexNumber1());
                    presenter.setComplexNumber2(request.getComplexNumber2());
                    presenter.mult();
                    answer = presenter.getComplexNumber3();
                    presenter.showComplexNumber(answer);
                    break;
                case '/':
                    presenter.setComplexNumber1(request.getComplexNumber1());
                    presenter.setComplexNumber2(request.getComplexNumber2());
                    presenter.div();
                    answer = presenter.getComplexNumber3();
                    presenter.showComplexNumber(answer);
                    break;
                default:
                    logger.log(Level.WARNING, "Invalid command");
                    System.out.println("Please enter the correct command");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        FileHandler fh = new FileHandler("log.txt", 100 * 1024, 1, true);
        logger.setUseParentHandlers(false);
        logger.setLevel(Level.ALL);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        logger.log(Level.INFO, "Start main");


        ViewRequests viewRequests = new ViewRequests(logger);
        ViewShows viewShows = new ViewShows();
        View view = new View(viewRequests, viewShows);
        PresenterMakeRequest presenterMakeRequest= new PresenterMakeRequest(view, logger);
        AddComplexNumbers addComplexNumbers = new AddComplexNumbers(logger);
        SubComplexNumbers subComplexNumbers = new SubComplexNumbers(logger);
        MultiplyComplexNumbers multiplyComplexNumbers = new MultiplyComplexNumbers(logger);
        DivideComplexNumber divideComplexNumber = new DivideComplexNumber(logger);
        Actions actions = new Actions(addComplexNumbers, subComplexNumbers,
                multiplyComplexNumbers, divideComplexNumber);
        PresenterRequest presenterRequest= new PresenterRequest();
        Presenter presenter = new Presenter(view, actions, presenterMakeRequest, presenterRequest, logger);

        onAddButtonClicked(presenter);
    }
}