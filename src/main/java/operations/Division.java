package operations;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class Division extends Operations {
    private double result;

    public Division(double number1, double number2, String operation) {
        super(number1, number2, operation);
        this.result = 0;
    }

    @Override
    public double calculation(double value1, double value2) {
        try {
            this.result = value1 / value2;
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Override
    public String toString() {
        if (!(this.result == Infinity)) {
            return "Результат деления числа " + this.getNumber1() + " на число " + this.getNumber2() + ": " + this.result + ".";
        }
        return "На 0 делить нельзя! Попробуйте изменить данные.";
    }
}