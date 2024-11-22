package operations;

public class PowerOfNumber extends Operations {
    private double result;

    public PowerOfNumber(double number1, double number2, String operation) {
        super(number1, number2, operation);
        this.result = 0;
    }

    @Override
    public double calculation(double value1, double value2) {
        this.result = Math.pow(value1, value2);
        return result;
    }

    @Override
    public String toString() {
        return "Результат возведения числа " + this.getNumber1() + " в степень " + this.getNumber2() + ": " + this.result + ".";
    }
}
