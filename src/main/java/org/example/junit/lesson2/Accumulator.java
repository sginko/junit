package org.example.junit.lesson2;

public class Accumulator {
    private int counter;

    public void accumulate(int number) {
        counter += number;
    }

    public int getCounter() {
        return counter;
    }
}
