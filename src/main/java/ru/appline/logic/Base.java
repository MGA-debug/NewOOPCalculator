package ru.appline.logic;


import ru.appline.logic.data.calculator.Calculator;
import ru.appline.logic.data.calculator.CalculatorException;

public class Base {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator
                    .calculate(1, 0, "/"));
        } catch (CalculatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(calculator
                    .calculate(1, 0, "&"));
        } catch (CalculatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(calculator
                    .calculate(1, 0, "*"));
        } catch (CalculatorException e) {
            System.err.println(e.getMessage());
        }
    }
}
