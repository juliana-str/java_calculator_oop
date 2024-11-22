import operations.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Base {

    public static double getNextDouble() {
        Scanner scanner = new Scanner(System.in);
        double value = 0;
        try {
            value = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("Нужно ввести цыфры, будьте внимательнее.");
            getNextDouble();
        }return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число.");
        double value1 = getNextDouble();
        System.out.println("Введите второе число.");
        double value2 = getNextDouble();
        System.out.println("Пожалуйста введите необходимую операцию. Доступные операции: " + "\n" +
                "Сложение чисел - '+'," + "\n" +
                "Вычитание чисел - '-'," + "\n" +
                "Умножение чисел - '*'," + "\n" +
                "Деление чисел - '/'," + "\n" +
                "Вычисление процента от числа - '%'," + "\n" +
                "Вычиcление степени - '**'."
        );
        String operation = scanner.next();
        scanner.close();
        switch (operation) {
            case "+":
                Addition additionResult = new Addition(value1, value2, operation);
                additionResult.calculation(value1, value2);
                System.out.println(additionResult);
                break;
            case "-":
                Subtraction subtractionResult = new Subtraction(value1, value2, operation);
                subtractionResult.calculation(value1, value2);
                System.out.println(subtractionResult);
                break;
            case "*":
                Multiplication multiplicationResult = new Multiplication(value1, value2, operation);
                multiplicationResult.calculation(value1, value2);
                System.out.println(multiplicationResult);
                break;
            case "/":
                if (value2 == 0) {
                    System.out.println();
                } else {
                    Division divisionResult = new Division(value1, value2, operation);
                    divisionResult.calculation(value1, value2);
                    System.out.println(divisionResult);
                }
                break;
            case "%":
                Percent percentResult = new Percent(value1, value2, operation);
                percentResult.calculation(value1, value2);
                System.out.println(percentResult);
                break;
            case "**":
                PowerOfNumber powerOfNumberResult = new PowerOfNumber(value1, value2, operation);
                powerOfNumberResult.calculation(value1, value2);
                System.out.println(powerOfNumberResult);
                break;
            default:
                System.out.println("Неверный выбор операции, попробуйте еще раз.");
        }
    }
}
