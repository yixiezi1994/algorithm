package com.just1984.algorithm.graph.common;

import java.util.*;

/**
 * 稀疏图（邻接表）
 */
public class SparseGraph implements Graph {

    /**
     * 顶点数
     */
    private int n;

    /**
     * 边数
     */
    private int m;

    /**
     * 是否有向
     */
    private boolean isDirected;

    private List<Set<Integer>> g;

    public SparseGraph(int n, boolean isDirected) {
        this.n = n;
        this.m = 0;
        this.isDirected = isDirected;
        this.g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new TreeSet<>());
        }
    }

    @Override
    public int V() {
        return n;
    }

    @Override
    public int E() {
        return m;
    }

    @Override
    public boolean hasEdge(int v, int w) {
        if (v >= 0 && v < n && w >= 0 && w < n) {
            return g.get(v).contains(w);
        }
        return false;
    }

    @Override
    public void addEdge(int v, int w) {
        if (hasEdge(v, w)) return;
        if (v >= 0 && v < n && w >= 0 && w < n) {
            g.get(v).add(w);
            m++;
        }
    }

    @Override
    public Iterator<Integer> getVIterator(int v) {
        return g.get(v).iterator();
    }
}
