package org.example.junit.lesson5;

public class SageAdditionalUtil {
    public int safeAdd(int a, int b) {
        long result = ((long) a) + b;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return ((int) result);
    }
}
