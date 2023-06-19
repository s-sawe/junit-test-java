package org.junit;

public class SimpleCalculator {

    public static int add(int numberA, int numberB){

        int sum = numberA + numberB;

        System.out.println("SUM : "+sum);

        return sum;
    }

    public static void main(String[] args) {
        add(10,90);
    }
}
