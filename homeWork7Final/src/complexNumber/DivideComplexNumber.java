package complexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DivideComplexNumber implements IDiv{
    Logger logger;

    public DivideComplexNumber(Logger logger) {
        this.logger = logger;
    }

    /**
     * делит одно комплексное число на другое комплексное число
     * @param c1 ComplexNumber - делимое
     * @param c2 ComplexNumber - делитель
     * @return ComplexNumber - частное от деления с1/с2
     */
    @Override
    public ComplexNumber div(ComplexNumber c1, ComplexNumber c2) {
        float newA = ((c1.getA() * c2.getA()) + (c1.getB() * c2.getB())) /
                ((c2.getA() * c2.getA()) + (c2.getB() * c2.getB()));
        float newB = ((c1.getB() * c2.getA()) - (c1.getA() * c2.getB())) /
                ((c2.getA() * c2.getA()) + (c2.getB() * c2.getB()));
        logger.log(Level.INFO, String.format("running DIV: (%.2f + %.2fi) / (%.2f + %.2fi)= %.2f + %.2fi",
                c1.getA(), c1.getB(), c2.getA(), c2.getB(), newA, newB));
        return new ComplexNumber(newA, newB);
    }
}
