package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour(){
        SimpleCalculator calculator = new SimpleCalculator();

        //YOU CAN ALSO CALL THE CLASS AS BELOW
        //var calculator = new SimpleCalculator();


        assertEquals(4,calculator.add(2,2));
        assertNotEquals(5,calculator.add(2,2));
        assertTrue(calculator.add(2,2) == 4);
        //assertNull();


    }

    //Make multiple scenarios for testing to ensure improved accuracy
    @Test
    void threePlusSevenShouldEqualFour(){
        var calculator = new SimpleCalculator();
        assertEquals(10, calculator.add(3,7));
    }

}