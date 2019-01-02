package com.just1984.algorithm.graph.common;

import java.util.*;

public class ShortestPath {

    private Graph g;

    private int s;

    private boolean[] visited;

    private int[] from;

    private int[] ord;

    public ShortestPath(Graph g, int s) {
        this.g = g;
        this.visited = new boolean[g.V()];
        this.from = new int[g.V()];
        this.ord = new int[g.V()];
        for (int i = 0; i < g.V(); i++) {
            visited[i] = false;
            from[i] = -1;
            ord[i] = -1;
        }
        this.s = s;

        /**
         * 最短路径算法
         */
        LinkedList<Integer> q = new LinkedList<>();
        q.add(s);
        visited[s] = true;
        ord[s] = 0;
        while (!q.isEmpty()) {
            Integer v = q.poll();
            Iterator<Integer> iterator = g.getVIterator(v);
            while (iterator.hasNext()) {
                Integer i = iterator.next();
                if (!visited[i]) {
                    q.push(i);
                    visited[i] = true;
                    from[i] = v;
                    ord[i] = ord[v] + 1;
                }
            }
        }
    }

    public boolean hasPath(int w) {
        return visited[w];
    }

    public List<Integer> path(int w) {
        Stack<Integer> s = new Stack<>();
        int p = w;
        while (p != -1) {
            s.push(p);
            p = from[p];
        }
        List<Integer> list = new ArrayList<>();
        while (!s.isEmpty()) {
            list.add(s.pop());
        }
        return list;
    }

    public void showPath(int w) {
        List<Integer> path = path(w);
        for (int i = 0; i < path.size(); i++) {
            if (i == 0) {
                System.out.print(path.get(i));
            } else {
                System.out.print(" -> " + path.get(i));
            }
        }
    }

    public int length(int w) {
        return ord[w];
    }
}
