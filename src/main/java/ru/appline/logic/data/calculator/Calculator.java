package ru.appline.logic.data.calculator;

public class Calculator {

    public double calculate(double firstArg, double secondArg, String operation) throws CalculatorException {
        double result = 0;
        switch (operation) {
            case "*":
                result = multiplication(firstArg, secondArg);
                break;
            case "/":
                result = division(firstArg, secondArg);
                break;
            case "-":
                result = subtraction(firstArg, secondArg);
                break;
            case "+":
                result = addition(firstArg, secondArg);
                break;
            default:
                throw new CalculatorException("Неизвестная математическая операция. Доступные операции:\n*\n/\n-\n+");
        }
        return result;
    }

    private double division(double firstArg, double secondArg) {
        checkSecondArgNotEqualsZero(secondArg);
        return firstArg / secondArg;
    }

    private double addition(double firstArg, double secondArg) {
        return firstArg + secondArg;
    }

    private double multiplication(double firstArg, double secondArg) {
        return firstArg * secondArg;
    }

    private double subtraction(double firstArg, double secondArg) {
        return firstArg - secondArg;
    }

    private void checkSecondArgNotEqualsZero(double arg) {
        if (arg == 0) throw new ArithmeticException("Деление на 0");
    }
}
