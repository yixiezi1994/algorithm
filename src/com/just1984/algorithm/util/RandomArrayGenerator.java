package com.just1984.algorithm.util;

public class RandomArrayGenerator {

    public static int[] generate(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = RandomNumberGenerator.getRandomInt(min, max);
        }
        return array;
    }
}
