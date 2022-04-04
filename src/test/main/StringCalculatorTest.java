package main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void main() {

    }

    @Test
    public void sum() {
        int result = StringCalculator.sum("10,20");
        int correct = 30;
        assertEquals(30,result);
    }
    
}