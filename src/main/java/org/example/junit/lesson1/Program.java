package org.example.junit.lesson1;


public class Program {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int sum = numbers.sum(5);
        System.out.println("Sum from 0 till 5 = " + sum);
    }
}