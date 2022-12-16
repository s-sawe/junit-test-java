package org.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGrade(59));
    }
    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D', grader.determineGrade(69));
    }

    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C', grader.determineGrade(79));
    }

    @Test
    void eightNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B', grader.determineGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A', grader.determineGrade(99));
    }

    //For negative numbers, where an illegalArgsException is thrown
    @Test
    void negativeShouldReturnIllegalArgsException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineGrade(-1);
        } );
       // grader.determineGrade(-1); //using this will fail because an exception will be thrown anyways
    }
}