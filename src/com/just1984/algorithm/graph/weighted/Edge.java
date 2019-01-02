package com.just1984.algorithm.graph.weighted;

import java.util.Objects;

public class Edge implements Comparable<Edge> {

    private int a;

    private int b;

    private int weight;

    public Edge() {}

    public Edge(int a, int b, int weight) {
        this.a = a;
        this.b = b;
        this.weight = weight;
    }

    public int v() {
        return a;
    }

    public int w() {
        return b;
    }

    public int weight() {
        return weight;
    }

    public int other(int v) {
        return v == a ? b : a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return a == edge.a &&
                b == edge.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public int compareTo(Edge o) {
        return new Integer(weight).compareTo(new Integer(o.weight()));
    }

}
