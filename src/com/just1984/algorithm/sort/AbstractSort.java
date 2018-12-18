package com.just1984.algorithm.sort;

import com.just1984.algorithm.util.SortUtil;

public abstract class AbstractSort implements Sort {

    @Override
    public void sort(int[] array) {
        long start = System.currentTimeMillis();
        sortArray(array);
        long end = System.currentTimeMillis();
        if (SortUtil.isSorted(array)) {
            System.out.println("排序耗时：" + (end - start) + "ms");
        } else {
            System.out.println("排序失败");
        }
    }

    protected abstract void sortArray(int[] array);

}
