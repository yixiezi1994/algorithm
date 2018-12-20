package com.just1984.algorithm.sort;

import com.just1984.algorithm.util.SortUtil;

public class QuickSortTwoWay extends QuickSort {

    @Override
    protected int partition(int[] array, int l, int r) {
        /**
         * 防止数组在极端有序的情况下排序性能问题，取随机种子
         */
        SortUtil.swap(array, l, (int) (Math.random() * (r - l + 1)) + l);
        int f = array[l];
        int i = l + 1;
        int j = r;
        while (true) {
            while (i <= r && array[i] < f) i++;
            while (j >= l + 1 && array[j] > f) j--;
            if (i > j) break;
            SortUtil.swap(array, i, j);
            i++;
            j--;
        }
        SortUtil.swap(array, l, j);
        return j;
    }
}
