package com.just1984.algorithm.util;

public class RandomNumberGenerator {

    public static int getRandomInt(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
}
