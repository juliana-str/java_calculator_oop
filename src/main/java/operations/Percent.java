package operations;

public class Percent extends Operations {
    private double result;

    public Percent(double number1, double number2, String operation) {
        super(number1, number2, operation);
        this.result = 0;
    }

    @Override
    public double calculation(double value1, double value2) {
        this.result = value1 / 100 * value2;
        return result;
    }

    @Override
    public String toString() {
        return this.getNumber2() + "%" + " от числа " + this.getNumber1() + ": " + this.result + ".";
    }
}
