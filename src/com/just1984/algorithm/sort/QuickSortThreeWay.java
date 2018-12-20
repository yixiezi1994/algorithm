package com.just1984.algorithm.sort;

import com.just1984.algorithm.util.SortUtil;

public class QuickSortThreeWay extends QuickSort {

    @Override
    protected void sort(int[] array, int l, int r) {
        if (l >= r) return;
        /**
         * 防止数组在极端有序的情况下排序性能问题，取随机种子
         */
        SortUtil.swap(array, l, (int) (Math.random() * (r - l + 1)) + l);
        int f = array[l];
        int lt = l;// array[l + 1...lt] < f
        int gt = r + 1;// array[gt...r] > f
        int i = l + 1;// array[lt + 1...i] = f
        while (i < gt) {
            if (array[i] < f) {
                SortUtil.swap(array, i, lt + 1);
                lt++;
                i++;
            } else if (array[i] > f) {
                SortUtil.swap(array, i, gt - 1);
                gt--;
            } else {
                i++;
            }
        }
        SortUtil.swap(array, l, lt);
        sort(array, l, lt - 1);
        sort(array, gt, r);
    }
}
