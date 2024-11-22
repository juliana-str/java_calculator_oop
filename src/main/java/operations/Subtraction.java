package operations;

public class Subtraction extends Operations {
    private double result;

    public Subtraction(double number1, double number2, String operation) {
        super(number1, number2, operation);
        this.result = 0;
    }

    @Override
    public double calculation(double value1, double value2) {
        this.result = value1 - value2;
        return result;
    }

    @Override
    public String toString() {
        return "Результат вычитания чисел " + super.toString() + ": " + this.result + ".";
    }
}
