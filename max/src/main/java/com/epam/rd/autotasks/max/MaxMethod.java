package com.epam.rd.autotasks.max;


import java.util.Arrays;

public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }
}
