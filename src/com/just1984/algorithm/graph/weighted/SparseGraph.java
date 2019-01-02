package com.just1984.algorithm.graph.weighted;

import java.util.*;

public class SparseGraph implements WeightedGraph {

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

    private List<Set<Edge>> g;

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
        return g.get(v).stream().anyMatch(item -> item.other(v) == w);
    }

    @Override
    public void addEdge(int v, int w, int weight) {
        if (hasEdge(v, w)) return;
        if (v >= 0 && v < n && w >= 0 && w < n) {
            g.get(v).add(new Edge(v, w, weight));
            m++;
        }
    }

    @Override
    public Iterator<Edge> getVIterator(int v) {
        return g.get(v).iterator();
    }
}
