import java.util.*;

public class Base {

    private static double getNextDouble() {
        Scanner scanner = new Scanner(System.in);
        double value;
        try {
            value = Double.parseDouble(scanner.next());
        } catch (InputMismatchException | NumberFormatException exception) {
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
        Calculator calculator = new Calculator();
        calculator.setValue1(value1);
        calculator.setValue2(value2);
        calculator.setOperation(operation);
        System.out.println(calculator.getResult());
    }
}
