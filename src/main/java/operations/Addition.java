package operations;

public class Addition extends Operations {
    private double result;

    public Addition(double number1, double number2, String operation) {
        super(number1, number2, operation);
        this.result = 0;
    }

    @Override
    public double calculation(double value1, double value2) {
        this.result = value1 + value2;
        return result;
    }

    @Override
    public String toString() {
        return "Результат сложения чисел " + super.toString() + ": " + this.result + ".";
    }
}
