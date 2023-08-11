package complexNumber;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SubComplexNumbers implements ISub{
    Logger logger;

    public SubComplexNumbers(Logger logger) {
        this.logger = logger;
    }

    /**
     * вычитание из комплексного числа
     * второго комплексного числа
     * @param c1 ComplexNumber уменьшаемое
     * @param c2 ComplexNumber вычитаемое
     * @return ComplexNumber разность с1-с2
     */
    public ComplexNumber sub(ComplexNumber c1, ComplexNumber c2){
        float newA = c1.getA() - c2.getA();
        float newB = c1.getB() - c2.getB();
        logger.log(Level.INFO, String.format("running SUB: (%.2f + %.2fi) - (%.2f + %.2fi)= %.2f + %.2fi",
                c1.getA(), c1.getB(), c2.getA(), c2.getB(), newA, newB));
        return new ComplexNumber(newA, newB);
    }
}
