package br.com.vinicius.study.topologicalOrdering;

import br.com.vinicius.study.model.Vertex;

import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {

    private Stack<Vertex> stack;

    public TopologicalOrdering() {
        this.stack = new Stack<>();
    }

    public void dfs(Vertex root) {

        root.setVisited(true);

        for (Vertex v : root.getNeighbors()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }

        stack.push(root);
    }

    public Stack<Vertex> getStack() {
        return stack;
    }
}
