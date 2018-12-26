package com.just1984.algorithm.search;

public class BinarySearch {

    public int search(int[] arr, int target) {
        return search(arr, 0, arr.length - 1, target);
    }

    private int search(int[] arr, int l, int r, int target) {
        if (l > r || target < arr[l] || target > arr[r]) return -1;
        int mid = l + (r - l) / 2;
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return search(arr, l, mid - 1, target);
        } else {
            return search(arr, mid + 1, r, target);
        }
    }
}
