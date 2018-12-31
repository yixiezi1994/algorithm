package com.just1984.algorithm.search;

public class UnionFind2 {

    private int[] parent;

    private int count;

    public UnionFind2(int n) {
        this.count = n;
        this.parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public void union(int p, int q) {
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);
        if (pRoot != -1 && qRoot != -1 && pRoot != qRoot) {
            parent[pRoot] = qRoot;
        }
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    private int findRoot(int p) {
        if (p >= count) return -1;
        while (p != parent[p]) {
            p = parent[p];
        }
        return p;
    }
}
