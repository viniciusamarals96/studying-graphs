package br.com.vinicius.study.cycleDetection;

import br.com.vinicius.study.model.Vertex2;

import java.util.List;

public class CycleDetection {


    public void cycleDetection(List<Vertex2> vertexList) {

        for (Vertex2 vertex : vertexList) {
            if (!vertex.isVisited()) {
                dfs(vertex);
            }
        }
    }

    private void dfs(Vertex2 root) {

        System.out.println("vertex " + root);
        root.setBeingVisited(true);

        System.out.println("Visiting the neighboors of " + root);
        for (Vertex2 v : root.getNeighbors()) {
            if (v.isBeingVisited()) {
                System.out.println("This is a Cycle.");
                return;
            }
            if (!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
        }

        System.out.println("Set vertex " + root + " to visited, and being visited to false");
        root.setBeingVisited(false);
        root.setVisited(true);
    }
}