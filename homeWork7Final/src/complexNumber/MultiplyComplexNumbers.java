package complexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MultiplyComplexNumbers implements IMult{
    Logger logger;

    public MultiplyComplexNumbers(Logger logger) {
        this.logger = logger;
    }
    /**
     * перемножает комплексные числа
     * @param c1 ComplexNumber 1-й множитель
     * @param c2 ComplexNumber 2-й множитель
     * @return ComplexNumber произведение с1*с2
     */
    @Override
    public ComplexNumber mult(ComplexNumber c1, ComplexNumber c2) {
        float newA = (c1.getA() * c2.getA()) - (c1.getB() * c2.getB());
        float newB = (c1.getB() * c2.getA()) + (c1.getA() * c2.getB());
        logger.log(Level.INFO, String.format("running MULT: (%.2f + %.2fi) * (%.2f + %.2fi)= %.2f + %.2fi",
                c1.getA(), c1.getB(), c2.getA(), c2.getB(), newA, newB));
        return new ComplexNumber(newA, newB);
    }
}
