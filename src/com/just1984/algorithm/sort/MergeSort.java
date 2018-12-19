package com.just1984.algorithm.sort;

public class MergeSort extends AbstractSort {

    public MergeSort() {
        super.setName("归并");
    }

    @Override
    protected void sortArray(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(int[] array, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        sort(array, l, mid);
        sort(array, mid + 1, r);
        /**
         * 对于近乎有序的数组，加判断优化
         */
        if (array[mid] > array[mid + 1]) {
            merge(array, l, mid, r);
        }
    }

    public void merge(int[] array, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];
        for (int i = l; i <= r; i++) {
            temp[i - l] = array[i];
        }
        int i = l;
        int j = mid + 1;
        for (int k = l; k <= r; k++) {
            if (i > mid) {
                array[k] = temp[j - l];
                j++;
            }else if (j > r) {
                array[k] = temp[i - l];
                i++;
            }else if (temp[i - l] < temp[j - l]) {
                array[k] = temp[i - l];
                i++;
            } else {
                array[k] = temp[j - l];
                j++;
            }
        }
    }
}
