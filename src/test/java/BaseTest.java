import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BaseTest {

    @DisplayName("Тест наличия сущности.")
    @Test
    public void checkCalculatorTest() {
        System.out.println("checkCalculatorTest");
        Calculator calculator = new Calculator();
        assertNotNull(calculator);
    }

    public Calculator createCalculator(double val1, double val2, String operation) {
        Calculator calculator = new Calculator();
        calculator.setValue1(val1);
        calculator.setValue2(val2);
        calculator.setOperation(operation);
        return calculator;
    }

    @DisplayName("Тест сложения.")
    @Test
    public void checkAdditionTest() {
        System.out.println("checkAdditionTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = ThreadLocalRandom.current().nextDouble(10);
        Calculator calculator = createCalculator(value1, value2, "+");
        String result = "Результат сложения чисел " + value1 + " и " + value2 + ": " + (value1 + value2) + ".";
        assertEquals(result, calculator.getResult());
    }

    @DisplayName("Тест вычитания.")
    @Test
    public void checkSubstractionTest() {
        System.out.println("checkSubstractionTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = ThreadLocalRandom.current().nextDouble(10);
        Calculator calculator = createCalculator(value1, value2, "-");
        String result = "Результат вычитания чисел " + value1 + " и " + value2 + ": " + (value1 - value2) + ".";
        assertEquals(result, calculator.getResult());
    }

    @DisplayName("Тест умножения.")
    @Test
    public void checkMultiplicationTest() {
        System.out.println("checkMultiplicationTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = ThreadLocalRandom.current().nextDouble(10);
        Calculator calculator = createCalculator(value1, value2, "*");
        String result = "Результат умножения чисел " + value1 + " и " + value2 + ": " + (value1 * value2) + ".";
        assertEquals(result, calculator.getResult());
    }

    @DisplayName("Тест деления.")
    @Test
    public void checkDivisionTest() {
        System.out.println("checkDivisionTest");
        double value1 = 10;
        double value2 = 5;
        Calculator calculator = createCalculator(value1, value2, "/");
        String result = "Результат деления числа " + value1 + " на число " + value2 + ": " + (value1 / value2) + ".";
        assertEquals(result, calculator.getResult());
    }

    @DisplayName("Тест деления/деление на 0.")
    @Test
    public void checkDivisionExceptionTest() {
        System.out.println("checkDivisionExceptionTest");
        double value1 = 10;
        double value2 = 0;
        Calculator calculator = createCalculator(value1, value2, "/");
        String result = "На 0 делить нельзя! Попробуйте изменить данные.";
        assertEquals(result, calculator.getResult());
    }

    @DisplayName("Тест нахождения процента от числа.")
    @Test
    public void checkPercentTest() {
        System.out.println("checkPercentTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = 10;
        Calculator calculator = createCalculator(value1, value2, "%");
        String result = value2 + "% от числа " + value1 + ": " + (value1 / 100 * value2) + ".";
        assertEquals(result, calculator.getResult());
    }

    @DisplayName("Тест возведения в степень.")
    @Test
    public void checkPowerOfNumberTest() {
        System.out.println("checkPowerOfNumberTest");
        double value1 = 10;
        double value2 = 3;
        Calculator calculator = createCalculator(value1, value2, "**");
        String result = "Результат возведения числа " + value1 + " в степень " + value2 + ": " + (Math.pow(value1, value2))
                + ".";
        assertEquals(result, calculator.getResult());
    }

    @BeforeEach
    public void setUpTest() {
        CommentSteps.addComment(CommentSteps.COMMENT_MINUS);
        CommentSteps.addComment("СТАРТ ТЕСТА");
        CommentSteps.addComment(CommentSteps.COMMENT_MINUS);

    }

    @AfterEach
    public void finishTest() {
        CommentSteps.addComment(CommentSteps.COMMENT_MINUS);
        CommentSteps.addComment("ТЕСТ УСПЕШНО ЗАВЕРШЕН");
        CommentSteps.addComment(CommentSteps.COMMENT_MINUS);
    }
}
