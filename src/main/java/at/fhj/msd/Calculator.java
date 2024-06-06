package at.fhj.msd;

public class Calculator {
    public static void main(String[] args) {

        System.out.println(add(2, 4));
        System.out.println(minus(2, 4));
        System.out.println(divide(2, 4));
        System.out.println(multiply(2, 4));

        System.out.println("Franziska Kassler");

    }

    public static double add(double number1, double number2){
        return number1 + number2;
    }

    public static double minus(double number1, double number2){
        return number1 - number2;
    }

    public static double divide(double number1, double number2){
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    public static double multiply(double number1, double number2){
        return number1 * number2;
    }
}
