package com.just1984.algorithm.sort;

public class MergeSortBU extends AbstractSort {

    public MergeSortBU() {
        super.setName("归并（自底向上）");
    }

    private MergeSort mergeSort = new MergeSort();

    @Override
    protected void sortArray(int[] array) {
        int len = array.length;
        for (int size = 1; size <= len; size *= 2) {
            for (int i = 0; i + size < len; i += size * 2) {
                /**
                 * 对数组【i...i+size-1】和【i+size...i+size*2-1】进行归并
                 */
                mergeSort.merge(array, i, i + size - 1, Math.min(i + size * 2 - 1, len -1));
            }
        }
    }
}
