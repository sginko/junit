package org.example.junit.lesson5;

public class ProviderTestData {
    public static Object[] providerBasicData() {
        return new Object[]{
                new Object[]{1, 2, 3},
                new Object[]{-10, 30, 20},
                new Object[]{15, -5, 10},
                new Object[]{-5, -10, -15}
        };
    }

    public static Object[] provideEdgeCaseData() {
        return new Object[]{
                new Object[]{Integer.MAX_VALUE, 2, Integer.MAX_VALUE},
                new Object[]{Integer.MIN_VALUE, -4, Integer.MIN_VALUE}
        };
    }
}
