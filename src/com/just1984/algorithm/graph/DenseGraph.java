package com.just1984.algorithm.graph;

import java.util.*;

/**
 * 稠密图（邻接矩阵）
 */
public class DenseGraph implements Graph {

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

    private boolean[][] g;

    public DenseGraph(int n, boolean isDirected) {
        this.n = n;
        this.m = 0;
        this.isDirected = isDirected;
        this.g = new boolean[n][n];
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
            return g[v][w];
        }
        return false;
    }

    @Override
    public void addEdge(int v, int w) {
        if (hasEdge(v, w)) return;
        if (v >= 0 && v < n && w >= 0 && w < n) {
            g[v][w] = true;
            if (!isDirected) {
                g[w][v] = true;
            }
            m++;
        }
    }

    @Override
    public Iterator<Integer> getVIterator(int v) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < g[v].length; i++) {
            if (g[v][i]) {
                set.add(i);
            }
        }
        return set.iterator();
    }
}
