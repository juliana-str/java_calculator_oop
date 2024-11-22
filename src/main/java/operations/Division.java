package operations;

public class Division extends Operations {
    private double result;

    public Division(double number1, double number2, String operation) {
        super(number1, number2, operation);
        this.result = 0;
    }

    @Override
    public double calculation(double value1, double value2) {
        this.result = value1 / value2;
        return result;
    }

    @Override
    public String toString() {
        return "Результат деления числа " + this.getNumber1() + " на число " + this.getNumber2() + ": " + this.result + ".";
    }
}