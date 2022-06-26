package com.shenjiafa.theory.junit.calculator_test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Function: Calculator test class
 *
 * @author ShenJiaFa
 * @since 2022/6/26
 */
public class CalculatorTest {

    /**
     * Init method
     */
    @Before
    public void init(){
        System.out.println("Init...");
    }

    /**
     * Close method
     */
    @After
    public void close(){
        System.out.println("Closing...");
    }

    /**
     * Test add method
     */
    @Test
    public void testAdd() {
        System.out.println("testAdd...");
        Calculator calculator = new Calculator();
        int res = calculator.add(1, 2);
        Assert.assertEquals(3, res);

    }

    /**
     * Test subtraction method
     */
   @Test
    public void testSub() {
        System.out.println("testSub...");
        Calculator calculator = new Calculator();
        int res = calculator.sub(1, 2);
        Assert.assertEquals(-1, res);

    }
}
