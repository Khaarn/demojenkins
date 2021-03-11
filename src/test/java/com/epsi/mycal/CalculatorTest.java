package com.epsi.mycal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void add() {
        int a = 2;
        int b = 3;

        Calculator calc = new Calculator();
        int actual = calc.add(a,b);

        assertEquals(5, actual);
    }

    @Test
    public void sub() {
        int a = 4;
        int b = 2;

        Calculator calc = new Calculator();
        int actual = calc.sub(a,b);

        assertEquals(2, actual);

    }
}