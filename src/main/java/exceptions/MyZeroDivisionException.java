package exceptions;

public class MyZeroDivisionException extends Exception {
    public MyZeroDivisionException() {
    }

    public String getMessage() {
        return "На 0 делить нельзя! Попробуйте изменить данные.";
    }
}
