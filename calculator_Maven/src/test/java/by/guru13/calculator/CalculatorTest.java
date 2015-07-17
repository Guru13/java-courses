package by.guru13.calculator;
/**
 * тестируем калькулятор
 */

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    /**
     * проверяем сложение двух чисел
     * @throws Exception
     */

    @Test
    public void testAdd() throws Exception {
        Calculator  calculator = new Calculator();
        calculator.add(1, 2);
        assertEquals(3, calculator.getResult(), 1);
    }

    /**
     * проверяем вычитание двух чисел
     * @throws Exception
     */
    @Test
    public void testSub() throws Exception {
        Calculator  calculator = new Calculator();
        calculator.sub(5, 1);
        assertEquals(4, calculator.getResult(),1);
    }

    /**
     * проверяем умножение двух чисел
     * @throws Exception
     */
    @Test
    public void testMul() throws Exception {
        Calculator   calculator = new Calculator();
        calculator.mul(12, 4);
        assertEquals(48, calculator.getResult(),1);
        calculator.mul(12, 0);
        assertEquals(0, calculator.getResult(),1);
        calculator.mul(12, 1);
        assertEquals(12, calculator.getResult(),1);
    }

    /**
     * Проверяем деление двух чисел
     * @throws Exception
     */
    @Test
    public void testDiv() throws Exception {
        Calculator   calculator = new Calculator();
        calculator.div(0, 12);
        assertEquals(0, calculator.getResult(),1);
        calculator.div(12, 4);
        assertEquals(3, calculator.getResult(),1);

    }

    /**
     * проверяем возведение в степень
     * @throws Exception
     */
    @Test
    public void testInv() throws Exception {
        Calculator   calculator = new Calculator();
        calculator.inv(0, 2);
        assertEquals(0, calculator.getResult(),1);
        calculator.inv(1, 8);
        assertEquals(1, calculator.getResult(),1);
        calculator.inv(4, 0);
        assertEquals(1, calculator.getResult(),1);
        calculator.inv(5, 1);
        assertEquals(5, calculator.getResult(),1);
    }

    /**
     * проверяем очистку результата
     * @throws Exception
     */
    @Test
    public void testCleanResult() throws Exception {
        Calculator  calculator = new Calculator();
        calculator.cleanResult();
        assertEquals(0,calculator.getResult(),1);

    }
}