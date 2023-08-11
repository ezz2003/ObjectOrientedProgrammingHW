package complexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;
/*
Сложение двух комплексных чисел
 */
public class AddComplexNumbers implements IAdd{
    Logger logger;

    public AddComplexNumbers(Logger logger) {
        this.logger = logger;
    }
    /**
     * складывает 2 комплексных числа
     * @param c1 ComplexNumber 1-е слагаемое
     * @param c2 ComplexNumber 2-е слагаемое
     * @return ComplexNumber сумма с1+с2
     */
    public ComplexNumber add(ComplexNumber c1, ComplexNumber c2){
        float newA = c1.getA() + c2.getA();
        float newB = c1.getB() + c2.getB();
        logger.log(Level.INFO, String.format("running ADD: (%.2f + %.2fi) + (%.2f + %.2fi)= %.2f + %.2fi",
                c1.getA(), c1.getB(), c2.getA(), c2.getB(), newA, newB));
        return new ComplexNumber(newA, newB);
    }
}
