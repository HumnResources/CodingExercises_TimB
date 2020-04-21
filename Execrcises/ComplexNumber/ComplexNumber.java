package Execrcises.ComplexNumber;

public class ComplexNumber {
    /*
        Complex Number: A number that can be expressed as: a + bi
        Where "a/b" are "Real Numbers" and "i" is a solution of the equation / "Imaginary Numbers"
        Add/subtract corresponding real & imaginary parts
        The sum of 5 + 3i and 4 + 2i is 9 + 5i
        The sum of 3 + i and -1 + 2i is 2 + 3i
     */

    private double real;
    private double imaginary;

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(ComplexNumber complexNumber) {
        this.add(complexNumber.real, complexNumber.imaginary);
    }
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber other) {
        this.subtract(other.real, other.imaginary);
    }


}
