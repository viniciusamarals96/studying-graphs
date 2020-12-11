package br.com.vinicius.study.dfs;

import br.com.vinicius.study.model.Vertex;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private Stack<Vertex> stack;

    public DepthFirstSearch() {
        this.stack = new Stack<>();
    }

    public void execute(List<Vertex> vertexList) {

        for (Vertex vertex : vertexList) {
            if (!vertex.isVisited()) {
                vertex.setVisited(true);
                dfsWithStack(vertex);
            }
        }
    }

    private void dfsWithStack(Vertex root) {

        this.stack.add(root);
        root.setVisited(true);

        while (!stack.isEmpty()) {
            Vertex actual = stack.pop();

            System.out.print(actual + " ");

            for (Vertex v : actual.getNeighbors()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    stack.push(v);
                }
            }
        }
    }

    private void dfsRecursive(Vertex root) {

        System.out.print(root + " ");

        for (Vertex v : root.getNeighbors()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                dfsRecursive(v);
            }
        }
    }
}

