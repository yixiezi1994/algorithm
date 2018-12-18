package com.just1984.algorithm.util;

public class RandomArrayGenerator {

    public static int[] generate(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = min + (int) (Math.random() * (max - min + 1));
        }
        return array;
    }
}
