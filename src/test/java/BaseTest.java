import operations.*;
import org.junit.jupiter.api.*;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BaseTest {

    @DisplayName("Тест наличия сущности.")
    @Test
    public void checkBaseTest() {
        System.out.println("checkBaseTest");
        Base base = new Base();
        assertNotNull(base);
    }

    @DisplayName("Тест сложения.")
    @Test
    public void checkAdditionTest() {
        System.out.println("checkAdditionTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = ThreadLocalRandom.current().nextDouble(10);
        Addition addition = new Addition(value1, value2, "addition");
        addition.calculation(value1, value2);
        String result = "Результат сложения чисел " + value1 + " и " + value2 + ": " + (value1 + value2) + ".";
        assertNotNull(addition);
        assertEquals(result, String.valueOf(addition));
    }

    @DisplayName("Тест вычитания.")
    @Test
    public void checkSubstractionTest() {
        System.out.println("checkSubstractionTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = ThreadLocalRandom.current().nextDouble(10);
        Subtraction subtraction = new Subtraction(value1, value2, "substraction");
        subtraction.calculation(value1, value2);
        String result = "Результат вычитания чисел " + value1 + " и " + value2 + ": " + (value1 - value2) + ".";
        assertNotNull(subtraction);
        assertEquals(result, String.valueOf(subtraction));
    }

    @DisplayName("Тест умножения.")
    @Test
    public void checkMultiplicationTest() {
        System.out.println("checkMultiplicationTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = ThreadLocalRandom.current().nextDouble(10);
        Multiplication multiplication = new Multiplication(value1, value2, "multiplication");
        multiplication.calculation(value1, value2);
        String result = "Результат умножения чисел " + value1 + " и " + value2 + ": " + (value1 * value2) + ".";
        assertNotNull(multiplication);
        assertEquals(result, String.valueOf(multiplication));
    }

    @DisplayName("Тест деления.")
    @Test
    public void checkDivisionTest() {
        System.out.println("checkDivisionTest");
        double value1 = 10;
        double value2 = 5;
        Division division = new Division(value1, value2, "division");
        division.calculation(value1, value2);
        String result = "Результат деления числа " + value1 + " на число " + value2 + ": " + (value1 / value2) + ".";
        assertNotNull(division);
        assertEquals(result, String.valueOf(division));
    }

    @DisplayName("Тест деления/деление на 0.")
    @Test
    public void checkDivisionExceptionTest() {
        System.out.println("checkDivisionExceptionTest");
        double value1 = 10;
        double value2 = 0;
        Division division = new Division(value1, value2, "division");
        division.calculation(value1, value2);
        String result = "На 0 делить нельзя! Попробуйте изменить данные.";
        assertEquals(result, String.valueOf(division));
    }

    @DisplayName("Тест нахождения процента от числа.")
    @Test
    public void checkPercentTest() {
        System.out.println("checkPercentTest");
        double value1 = ThreadLocalRandom.current().nextDouble(10);
        double value2 = 10;
        Percent percent = new Percent(value1, value2, "percent");
        percent.calculation(value1, value2);
        String result = value2 + "% от числа " + value1 + ": " + (value1 / 100 * value2) + ".";
        assertNotNull(percent);
        assertEquals(result, String.valueOf(percent));
    }

    @DisplayName("Тест возведения в степень.")
    @Test
    public void checkPowerOfNumberTest() {
        System.out.println("checkPowerOfNumberTest");
        double value1 = 10;
        double value2 = 3;
        PowerOfNumber powerOfNumber = new PowerOfNumber(value1, value2, "powerOfNumber");
        powerOfNumber.calculation(value1, value2);
        String result = "Результат возведения числа " + value1 + " в степень " + value2 + ": " + (Math.pow(value1, value2))
                + ".";
        assertNotNull(powerOfNumber);
        assertEquals(result, String.valueOf(powerOfNumber));
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
