public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber com) {
        return new ComplexNumber(this.real + com.real, this.imaginary + com.imaginary);
    }

    public boolean equal(ComplexNumber com) {
        if (this.real != com.real) {
            return false;
        }

        if (this.imaginary != com.imaginary) {
            return false;
        }

        return true;
    }

    public static ComplexNumber add(ComplexNumber com1, ComplexNumber com2) {
        return new ComplexNumber(com1.real + com2.real, com1.imaginary + com2.imaginary);
    }

    public static boolean equal(ComplexNumber com1, ComplexNumber com2) {
        if (com1.real != com2.real) {
            return false;
        }

        if (com1.imaginary != com2.imaginary) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "real = " + this.real + "\nimaginary = " + this.imaginary;
    }
}
