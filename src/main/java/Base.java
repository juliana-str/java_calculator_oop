import operations.*;

import java.util.*;

public class Base {

    private static double getNextDouble() {
        Scanner scanner = new Scanner(System.in);
        double value;
        try {
            value = Double.parseDouble(scanner.next());
        } catch (InputMismatchException|NumberFormatException exception) {
            System.out.println("Нужно ввести целое или дробное число с разделителем '.', будьте внимательнее.");
            value = getNextDouble();
        }
        return value;
    }

    private static String getNext() {
        Scanner scanner = new Scanner(System.in);
        String action = scanner.next();
        List<String> actions = new ArrayList<>(Arrays.asList("+", "-", "*", "/", "**", "%"));
        if (!actions.contains(action)) {
            System.out.println("Неверный выбор операции, попробуйте еще раз.");
            action = getNext();
        }
        return action;
    }

    public static void main(String[] args) {
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
        String operation = getNext();
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
                Division divisionResult = new Division(value1, value2, operation);
                    divisionResult.calculation(value1, value2);
                    System.out.println(divisionResult);
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
        }
    }
}
