package com.just1984.algorithm.graph.weighted;

import java.util.Iterator;

public interface WeightedGraph {

    int V();

    int E();

    boolean hasEdge(int v, int w);

    void addEdge(int v, int w, int weight);

    Iterator<Edge> getVIterator(int v);

}
