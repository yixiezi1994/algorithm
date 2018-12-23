package com.just1984.algorithm.sort;

import com.just1984.algorithm.heap.MaxHeap;
import com.just1984.algorithm.util.SortUtil;

public class HeapSort extends AbstractSort {

    public HeapSort() {
        super.setName("堆");
    }

    @Override
    protected void sortArray(int[] array) {
        int len = array.length;
        // heapify
        for (int i = (len - 1) / 2; i >= 0; i--) {
            shiftDown(array, len, i);
        }
        for (int i = len- 1; i > 1; i--) {
            SortUtil.swap(array, 0, i);
            shiftDown(array, i, 0);
        }
    }

    private void shiftDown(int[] array,int n, int k) {
        while (k * 2 + 1 < n) {
            int j = k * 2 + 1;
            if (j + 1 < n && array[j + 1] > array[j]) {
                j++;
            }
            if (array[k] >= array[j]) {
                break;
            }
            SortUtil.swap(array, k, j);
            k = j;
        }
    }

}
