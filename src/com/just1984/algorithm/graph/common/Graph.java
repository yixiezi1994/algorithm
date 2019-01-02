package com.just1984.algorithm.graph.common;

import java.util.Iterator;

public interface Graph {

    int V();

    int E();

    boolean hasEdge(int v, int w);

    void addEdge(int v, int w);

    Iterator<Integer> getVIterator(int v);
}
