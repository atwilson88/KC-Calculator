// This project is a simple calculator. It calculates the
//sum, difference, product, remainder, and modulos of integers.

public class Calculator {

    public Calculator() {

    }

    public int add(int a, int b) {
        int newInteger = a + b;

        return newInteger;
    }

    public int subtract(int a, int b) {
        int newInteger = a - b;

        return newInteger;
    }

    public int multiply(int a, int b) {
        int newInteger = a * b;

        return newInteger;
    }

    public int divide(int a, int b) {
        int newInteger = a / b;

        return newInteger;
    }

    public int modulo(int a, int b) {
        int newInteger = a % b;

        return newInteger;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(12, 55));
        System.out.println(myCalculator.divide(36, 6));
        System.out.println(myCalculator.modulo(77, 7));
    }
}