package org.junit;

public class Grader {

    public char determineGrade(int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Invalid Grade");
        } else if (numberGrade < 60) {
            return 'F';
        } else if (numberGrade < 70) {
            return 'D';
        }else if (numberGrade < 80){
            return 'C';
        }else if (numberGrade < 90){
            return 'B';
        }else{
            return 'A';
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}