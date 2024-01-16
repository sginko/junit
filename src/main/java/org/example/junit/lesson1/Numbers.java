package org.example.junit.lesson1;

public class Numbers {

    public int sum(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            result += i;
        }
        return result;
    }
}
