package com.just1984.algorithm.test;

import com.just1984.algorithm.search.UnionFind;
import com.just1984.algorithm.search.UnionFind2;
import com.just1984.algorithm.search.UnionFind3;
import com.just1984.algorithm.search.UnionFind4;

public class UnionFindTest {

    public static void main(String[] args) {
        int n = 1000000;
        UnionFind4 unionFind = new UnionFind4(n);
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            int p = (int) (Math.random() * n);
            int q = (int) (Math.random() * n);
            unionFind.union(p, q);
        }
        for (int i = 0; i < n; i++) {
            int p = (int) (Math.random() * n);
            int q = (int) (Math.random() * n);
            unionFind.isConnected(p, q);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
