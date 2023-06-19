package org.junit;

public class Grader {

    public static char determineGrade(int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Invalid Grade");
        } else if (numberGrade < 60) {
            System.out.println("F");
            return 'F';
        } else if (numberGrade < 70) {
            System.out.println("D");
            return 'D';
        }else if (numberGrade < 80){
            System.out.println("C");
            return 'C';
        }else if (numberGrade < 90){
            System.out.println("B");
            return 'B';
        }else{
            System.out.println("A");
            return 'A';
        }
    }
    public static void main(String[] args) {
        determineGrade(10);
    }
}
