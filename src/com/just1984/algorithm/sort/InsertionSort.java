package com.just1984.algorithm.sort;

public class InsertionSort extends AbstractSort {

    public InsertionSort() {
        super.setName("插入");
    }

    @Override
    protected void sortArray(int[] array) {
        int len = array.length;
        for (int i = 1; i < len; i++) {
            int j = i;
            int val = array[i];
            while (j > 0 && array[j - 1] > val) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = val;
        }
    }
}
