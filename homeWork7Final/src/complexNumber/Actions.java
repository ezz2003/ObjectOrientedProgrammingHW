package complexNumber;
/*
complexNumber1 - 1й операнд
complexNumber2 - 2й операнд
complexNumber3 - результат операции
 */
public class Actions { // , IAdd, ISub
    private ComplexNumber complexNumber1;
    private ComplexNumber complexNumber2;
    private ComplexNumber complexNumber3;
    AddComplexNumbers addComplexNumbers;
    SubComplexNumbers subComplexNumbers;
    MultiplyComplexNumbers multiplyComplexNumbers;
    DivideComplexNumber divideComplexNumber;

    public Actions(AddComplexNumbers addComplexNumbers, SubComplexNumbers subComplexNumbers,
                   MultiplyComplexNumbers multiplyComplexNumbers, DivideComplexNumber divideComplexNumber) {
        this.addComplexNumbers = addComplexNumbers;
        this.subComplexNumbers = subComplexNumbers;
        this.multiplyComplexNumbers = multiplyComplexNumbers;
        this.divideComplexNumber = divideComplexNumber;
    }

    private Actions(ComplexNumber complexNumber1, ComplexNumber complexNumber2) {
        this.complexNumber1 = complexNumber1;
        this.complexNumber2 = complexNumber2;
        this.complexNumber3 = getComplexNumber3();
    }

    public void add() {
        this.complexNumber3 = addComplexNumbers.add(complexNumber1, complexNumber2);
    }

    public void sub() {
        this.complexNumber3 = subComplexNumbers.sub(complexNumber1, complexNumber2);
    }

    public void mult() {
        this.complexNumber3 = multiplyComplexNumbers.mult(complexNumber1, complexNumber2);
    }

    ;

    public void div() {
        this.complexNumber3 = divideComplexNumber.div(complexNumber1, complexNumber2);
    }

    public void setComplexNumber1(ComplexNumber complexNumber1) {
        this.complexNumber1 = complexNumber1;
    }

    public void setComplexNumber2(ComplexNumber complexNumber2) {
        this.complexNumber2 = complexNumber2;
    }

    public ComplexNumber getComplexNumber3() {
        return complexNumber3;
    }

}
