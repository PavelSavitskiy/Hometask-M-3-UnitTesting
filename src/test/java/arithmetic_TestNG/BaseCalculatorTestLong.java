package arithmetic_TestNG;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseCalculatorTestLong {
    Calculator calculator;

    long a;
    long b;
    long expected;

    public void stringToLong(Object aTemp, Object bTemp, Object expectedTemp) {
        a = Long.parseLong((String) aTemp);
        b = Long.parseLong((String) bTemp);
        expected = Long.parseLong((String) expectedTemp);
    }

    @BeforeClass
    public void createCalculator() {
        calculator = new Calculator();
    }
}