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
            throw new MyException();
        } catch (NullPointerException | MyException ex) {
            ex.printStackTrace();
        }
        return result;
}

    @Override
    public String toString() {
        if (!(this.result == Infinity)) {
            return "Результат деления числа " + this.getNumber1() + " на число " + this.getNumber2() + ": " + this.result + ".";
        }return "Попробуйте изменить данные.";
    }
}