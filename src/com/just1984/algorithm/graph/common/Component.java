package com.just1984.algorithm.graph.common;

import java.util.Iterator;

public class Component {

    private Graph g;

    private boolean[] visited;

    private int[] ids;

    /**
     * 连通分量
     */
    private int count;

    public Component(Graph g) {
        this.g = g;
        this.visited = new boolean[g.V()];
        this.ids = new int[g.V()];
        this.count = 0;
        /**
         * 计算连通分量
         */
        for (int i = 0; i < g.V(); i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
    }

    public int count() {
        return count;
    }

    public boolean isConnected(int v, int w) {
        return ids[v] == ids[w];
    }

    private void dfs(int v) {
        visited[v] = true;
        ids[v] = count;
        Iterator<Integer> iterator = g.getVIterator(v);
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (!visited[i]) {
                dfs(i);
            }
        }
    }
}
