import org.junit.Assert;
import org.junit.Test;
import ru.appline.logic.data.calculator.Calculator;
import ru.appline.logic.data.calculator.CalculatorException;

public class UnitTests {

    @Test
    public void calculatorAdditionTest() throws CalculatorException {
        Assert.assertEquals("Результат сложения отличается от ожидаемого",
                Double.compare(new Calculator().calculate(1, 2, "+"), 3), 0);
    }

    @Test
    public void calculatorSubtractionTest() throws CalculatorException {
        Assert.assertEquals("Результат вычитания отличается от ожидаемого",
                Double.compare(new Calculator().calculate(1, 2, "-"), -1), 0);
    }

    @Test
    public void calculatorMultiplicationTest() throws CalculatorException {
        Assert.assertEquals("Результат сложения отличается от ожидаемого",
                Double.compare(new Calculator().calculate(1, 2, "*"), 2), 0);
    }

    @Test
    public void calculatorDivisionByNotZeroTest() throws CalculatorException {
        Assert.assertEquals("Результат сложения отличается от ожидаемого",
                Double.compare(new Calculator().calculate(6, 2, "/"), 3), 0);
    }

    @Test
    public void calculatorDivisionByZeroTest() throws CalculatorException {
        Assert.assertThrows("Результат сложения отличается от ожидаемого",
                ArithmeticException.class, () -> new Calculator().calculate(5, 0, "/"));
    }

    @Test
    public void calculatorWithIncorrectOperationTest() throws CalculatorException {
        Assert.assertThrows("Результат сложения отличается от ожидаемого",
                CalculatorException.class, () -> new Calculator().calculate(5, 1, "&"));
    }
}
