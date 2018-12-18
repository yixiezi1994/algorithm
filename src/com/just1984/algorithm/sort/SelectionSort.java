package com.just1984.algorithm.sort;

import com.just1984.algorithm.util.SortUtil;

public class SelectionSort extends AbstractSort {

    @Override
    public void sortArray(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            int minIndex = i;
            for (int j = minIndex; j < len; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            SortUtil.swap(array, i, minIndex);
        }
    }

}
