package com.just1984.algorithm;

import com.just1984.algorithm.sort.*;
import com.just1984.algorithm.util.RandomArrayGenerator;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        int[] array = RandomArrayGenerator.generate(100000, 0, 10000);
        /*int[] array1 = Arrays.copyOf(array, array.length);
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        selectionSort.sort(array);
        insertionSort.sort(array1);*/
        Sort mergeSort = new MergeSortBU();
        mergeSort.sort(array);
    }

}
