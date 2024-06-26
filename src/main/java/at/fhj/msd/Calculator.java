package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    //initialize Logger
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) {




        System.out.println(add(2, 4));
        System.out.println(minus(2, 4));
        System.out.println(divide(2, 4));
        System.out.println(multiply(2, 4));

        //log entries
        logger.info("Info message");
        logger.error("Error message");

        System.out.println("Franziska Kassler");

    }

    public static double add(double number1, double number2){
        logger.debug("Add method called with parameters: number1={}, number2={}", number1, number2);
        return number1 + number2;
    }

    public static double minus(double number1, double number2){
        logger.debug("Minus method called with parameters: number1={}, number2={}", number1, number2);
        return number1 - number2;
    }

    public static double divide(double number1, double number2){
        logger.debug("Divide method called with parameters: number1={}, number2={}", number1, number2);

        if (number2 == 0) {
            logger.error("Error: Division by zero attempted");
            throw new ArithmeticException("Division by zero");
        }
        return number1 / number2;
    }

    public static double multiply(double number1, double number2){
        logger.debug("Multiply method called with parameters: number1={}, number2={}", number1, number2);
        return number1 * number2;
    }

    public static int factorial(int number){
        logger.debug("Factorial method called with parameter: number={}", number);
        if (number < 0) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;

    }

}
