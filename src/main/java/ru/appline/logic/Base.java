package ru.appline.logic;


import ru.appline.logic.data.calculator.Calculator;
import ru.appline.logic.data.calculator.CalculatorException;

import java.util.Scanner;

public class Base {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Введите первое число");
                double firstArg = calculator.checkOperand(scanner.nextLine());
                System.out.println("Введите операцию");
                String operation = scanner.nextLine();
                System.out.println("Введите второе число");
                double secondArg = calculator.checkOperand(scanner.nextLine());
                resultFormat(calculator.calculate(firstArg, secondArg, operation));
            } catch (CalculatorException e) {
                System.err.print(e.getMessage());
                continue;
            }
            System.out.println("Продолжить работу? да/нет");
            String command = scanner.nextLine();
            if (!"да".equals(command)) {
                scanner.close();
                break;
            }
        }
    }

    public static void resultFormat(double result) {
        System.out.println("Результат: ");
        System.out.printf("%+.4f", result);
        System.out.println("");
    }
}
