package com.just1984.algorithm.graph.weighted;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class DenseGraph implements WeightedGraph {

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

    private List<List<Edge>> g;

    public DenseGraph(int n, boolean isDirected) {
        this.n = n;
        this.m = 0;
        this.isDirected = isDirected;
        this.g = new ArrayList<>(n);
        for (int i = 0; i < g.size(); i++) {
            List<Edge> edges = new ArrayList<>(n);
            for (int j = 0; j < edges.size(); j++) {
                edges.add(null);
            }
            g.add(edges);
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
        return g.get(v).get(w) != null;
    }

    @Override
    public void addEdge(int v, int w, int weight) {
        if (hasEdge(v, w)) return;
        g.get(v).set(w, new Edge(v, w, weight));
        if (!isDirected) {
            g.get(w).set(v, new Edge(w, v, weight));
        }
        m++;
    }

    @Override
    public Iterator<Edge> getVIterator(int v) {
        return g.get(v).stream().filter(item -> item != null).collect(Collectors.toList()).iterator();
    }
}
