package com.just1984.algorithm.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Path {

    private Graph g;

    private int s;

    private boolean[] visited;

    private int[] from;

    public Path(Graph g, int s) {
        this.g = g;
        this.visited = new boolean[g.V()];
        this.from = new int[g.V()];
        for (int i = 0; i < g.V(); i++) {
            visited[i] = false;
            from[i] = -1;
        }
        this.s = s;
        /**
         * 寻路算法
         */
        dfs(s);
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

    private void dfs(int v) {
        visited[v] = true;
        Iterator<Integer> iterator = g.getVIterator(v);
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (!visited[i]) {
                from[i] = v;
                dfs(i);
            }
        }
    }

}
