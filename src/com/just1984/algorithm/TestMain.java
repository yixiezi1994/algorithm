package com.just1984.algorithm;

import com.just1984.algorithm.heap.MaxHeap;
import com.just1984.algorithm.search.BinarySearch;
import com.just1984.algorithm.search.BinarySearchTree;
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

        /*MaxHeap heap = new MaxHeap(100);
        for (int i = 0; i < 100; i++) {
            heap.insert(RandomNumberGenerator.getRandomInt(0, 100));
        }
        heap.print();
        System.out.println(heap.extractMax());
        heap.print();*/

        /*int[] array = RandomArrayGenerator.generate(1000000, 0, 100);
        Sort heapSort = new HeapSort();
        heapSort.sort(array);*/
        //System.out.println(Arrays.toString(array));

        /*int[] arr = {1, 2, 3, 4, 5};
        BinarySearch search = new BinarySearch();
        int result = search.search(arr, 2);
        System.out.println(result);*/
        /*BinarySearchTree<Integer, Integer> binarySearchTree = new BinarySearchTree<>();
        binarySearchTree.insert(1,1);
        binarySearchTree.insert(10,10);
        binarySearchTree.insert(8,8);
        binarySearchTree.insert(5,5);
        binarySearchTree.insert(7,7);
        binarySearchTree.insert(2,2);
        binarySearchTree.insert(3,3);
        binarySearchTree.insert(6,6);
        binarySearchTree.insert(12,12);
        System.out.println(binarySearchTree.size());
        Integer result = binarySearchTree.search(2);
        System.out.println(result);*/

        boolean[][] arr = new boolean[2][2];
        System.out.println(arr[1][0]);
    }

}
