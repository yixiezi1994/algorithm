package com.just1984.algorithm;

import com.just1984.algorithm.heap.MaxHeap;
import com.just1984.algorithm.sort.*;
import com.just1984.algorithm.util.RandomArrayGenerator;
import com.just1984.algorithm.util.RandomNumberGenerator;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        /*int[] array = RandomArrayGenerator.generate(1000000, 0, 100);
        int[] array1 = Arrays.copyOf(array, array.length);
        Sort selectionSort = new SelectionSort();
        Sort insertionSort = new InsertionSort();
        selectionSort.sort(array);
        insertionSort.sort(array1);
        Sort mergeSort = new MergeSortBU();
        mergeSort.sort(array);
        Sort quickSort = new QuickSortThreeWay();
        quickSort.sort(array);*/

        MaxHeap heap = new MaxHeap(100);
        for (int i = 0; i < 100; i++) {
            heap.insert(RandomNumberGenerator.getRandomInt(0, 100));
        }
        heap.print();
        System.out.println(heap.extractMax());
        heap.print();
    }

}
