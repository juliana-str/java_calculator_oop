package operations;

public class MyException extends Exception {
    public MyException() {

    }

    public String getMessage() {
        System.out.println("На 0 делить нельзя!");
        return null;
    }
}
