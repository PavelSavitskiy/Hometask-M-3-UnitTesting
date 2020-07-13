package trigonometry_JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Before;

public class BaseCalculatorPosNegTest {
    Calculator calculator;

    @Before
    public void createCalculator() {
        calculator = new Calculator();
    }
}
