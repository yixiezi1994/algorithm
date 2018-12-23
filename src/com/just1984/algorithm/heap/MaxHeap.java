package com.just1984.algorithm.heap;

import com.just1984.algorithm.util.SortUtil;

import java.util.Arrays;

public class MaxHeap {

    private int[] data;

    private int count;

    private int capacity;

    public MaxHeap(int capacity) {
        this.data = new int[capacity + 1];
        this.count = 0;
        this.capacity = capacity;
    }

    public MaxHeap(int[] array) {
        int len = array.length;
        this.data = new int[len + 1];
        this.capacity = len;
        for (int i = 0; i < len; i++) {
            data[i + 1] = array[i];
        }
        this.count = len;

        for (int i = count / 2; i >= 1; i--) {
            shiftDown(i);
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }

    public void insert(int item) {
        if (count + 1 > capacity) {
            throw new RuntimeException("over heap capacity");
        }
        data[count + 1] = item;
        count++;
        shiftUp(count);
    }

    public int extractMax() {
        if (this.isEmpty()) {
            throw new RuntimeException("heap is empty");
        }
        int result = data[1];
        SortUtil.swap(data, 1, count);
        shiftDown(1);
        return result;
    }

    private void shiftUp(int k) {
        while (k > 1 && data[k / 2] < data[k]) {
            SortUtil.swap(data, k, k / 2);
            k /= 2;
        }
    }

    private void shiftDown(int k) {
        while(k * 2 <= count) {
            int j = k * 2;
            if (j + 1 <= count && data[j + 1] > data[j]) {
                j++;
            }
            if (data[k] > data[j]) {
                break;
            }
            SortUtil.swap(data, k ,j);
            k = j;
        }
    }

}
