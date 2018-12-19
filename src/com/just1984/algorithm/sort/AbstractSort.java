package com.just1984.algorithm.sort;

import com.just1984.algorithm.util.SortUtil;

public abstract class AbstractSort implements Sort {

    private String name;

    @Override
    public void sort(int[] array) {
        long start = System.currentTimeMillis();
        sortArray(array);
        long end = System.currentTimeMillis();
        if (SortUtil.isSorted(array)) {
            System.out.println(this.getName() + "排序耗时：" + (end - start) + "ms");
        } else {
            System.out.println(this.getName() + "排序失败");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void sortArray(int[] array);

}
