package com.just1984.algorithm.sort;

import com.just1984.algorithm.heap.MaxHeap;

public class HeapSort extends AbstractSort {

    public HeapSort() {
        super.setName("堆");
    }

    @Override
    protected void sortArray(int[] array) {
        MaxHeap maxHeap = new MaxHeap(array);
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = maxHeap.extractMax();
        }
    }

}
