package com.just1984.algorithm;

import com.just1984.algorithm.sort.InsertionSort;
import com.just1984.algorithm.sort.SelectionSort;
import com.just1984.algorithm.sort.Sort;
import com.just1984.algorithm.util.RandomArrayGenerator;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generate(100000, 0, 1000);
        int[] array1 = Arrays.copyOf(array, array.length);
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        selectionSort.sort(array);
        insertionSort.sort(array1);
    }

}
