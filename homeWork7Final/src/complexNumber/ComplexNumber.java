package complexNumber;
/*
Объект - комплексное число:
a - действительная часть комплексного числа
b - мнимая часть комплексного числа
 */
public class ComplexNumber {
    private float a;
    private float b;

    public ComplexNumber(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}
