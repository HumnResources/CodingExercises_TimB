import Execrcises.ComplexNumber.ComplexNumber;

public class Main {

    public static void main(String[] args) {

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);
        two.add(one);
        double output = two.getImaginary();
        System.out.println(output);

    }



}
