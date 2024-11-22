package operations;

public abstract class Operations {
    private double number1;
    private double number2;
    private String operation;

    public Operations(double number1, double number2, String operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public abstract double calculation(double value1, double value2);

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public String getOperation() {
        return operation;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return getNumber1() + " и " + getNumber2();
    }
}
