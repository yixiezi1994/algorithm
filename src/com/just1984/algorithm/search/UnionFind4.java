package com.just1984.algorithm.search;

public class UnionFind4 {

    private int[] parent;

    private int[] rank;

    private int count;

    public UnionFind4(int n) {
        this.count = n;
        this.parent = new int[n];
        this.rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public void union(int p, int q) {
        int pRoot = findRoot(p);
        int qRoot = findRoot(q);
        if (pRoot != -1 && qRoot != -1 && pRoot != qRoot) {
            if (rank[pRoot] < rank[qRoot]) {
                parent[pRoot] = qRoot;
            } else if (rank[qRoot] < rank[pRoot]){
                parent[qRoot] = pRoot;
            } else {
                parent[pRoot] = qRoot;
                rank[qRoot]++;
            }
        }
    }

    public boolean isConnected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    private int findRoot(int p) {
        if (p >= count) return -1;
        /**
         * 路径压缩优化
         * 所有节点都指向根节点
         */
        if (p != parent[p]) {
            parent[p] = findRoot(parent[p]);
        }
        return parent[p];
    }

}
