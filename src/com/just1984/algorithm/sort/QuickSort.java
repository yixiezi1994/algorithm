package com.just1984.algorithm.sort;

import com.just1984.algorithm.util.SortUtil;

public class QuickSort extends AbstractSort {

    public QuickSort() {
        super.setName("快速");
    }

    @Override
    protected void sortArray(int[] array) {
        sort(array, 0, array.length - 1);
    }

    protected void sort(int[] array, int l, int r) {
        if (l >= r) return;
        int p = partition(array, l, r);
        sort(array, l, p - 1);
        sort(array, p + 1, r);
    }

    /**
     * 找到索引值p，使array[l...p-1] < array[p]，array[p+1...r] > array[p]
     * @param array
     * @param l
     * @param r
     * @return
     */
    protected int partition(int[] array, int l, int r) {
        /**
         * 防止数组在极端有序的情况下排序性能问题，取随机种子
         */
        SortUtil.swap(array, l, (int) (Math.random() * (r - l + 1)) + l);
        int f = array[l];
        int j = l;
        for (int i = l; i <= r; i++) {
            if (array[i] < f) {
                SortUtil.swap(array, j + 1, i);
                j++;
            }
        }
        SortUtil.swap(array, j, l);
        return j;
    }

}
