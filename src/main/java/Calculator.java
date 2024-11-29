import exceptions.MyZeroDivisionException;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Calculator {
    private double value1;
    private double value2;
    private String operation;
    private static double result = 0;

    public Calculator() {
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        switch (this.operation) {
            case "+":
                return addition();
            case "-":
                return subtraction();
            case "*":
                return multiplication();
            case "/":
                return division();
            case "%":
                return percent();
            case "**":
                return powerOfNumber();
        }
        return String.valueOf(result);
    }

    private String addition() {
        result = value1 + value2;
        return "Результат сложения чисел " + baseString() + ": " + result + ".";
    }

    private String subtraction() {
        result = value1 - value2;
        return "Результат вычитания чисел " + baseString() + ": " + result + ".";
    }

    private String multiplication() {
        result = value1 * value2;
        return "Результат умножения чисел " + baseString() + ": " + result + ".";
    }

    private String division() {
        try {
            result = value1 / value2;
            if (result == Infinity) {
                throw new MyZeroDivisionException();
            }
            return "Результат деления числа " + value1 + " на число " + value2 + ": " + result + ".";
        } catch (MyZeroDivisionException | NullPointerException ex) {
            return (ex.getMessage());
        }
    }

    private String percent() {
        result = value1 / 100 * value2;
        return value2 + "%" + " от числа " + value1 + ": " + result + ".";
    }

    private String powerOfNumber() {
        result = Math.pow(value1, value2);
        return "Результат возведения числа " + value1 + " в степень " + value2 + ": " + result + ".";

    }

    private String baseString() {
        return this.value1 + " и " + this.value2;
    }
}
