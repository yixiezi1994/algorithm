package com.just1984.algorithm.search;

public class UnionFind {

    private int[] ids;

    private int count;

    public UnionFind(int n) {
        this.count = n;
        this.ids = new int[n];
        for (int i = 0; i < n; i++) {
            ids[i] = i;
        }
    }

    public int find(int p) {
        if (p < count) {
            return ids[p];
        }
        return -1;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pid = find(q);
        int qid = find(q);
        if (pid != -1 && qid != -1 && pid != qid) {
            for (int i = 0; i < count; i++) {
                if (ids[i] == pid) {
                    ids[i] = qid;
                }
            }
        }
    }
}
