package br.com.vinicius.study.model;

import java.util.ArrayList;
import java.util.List;

public class Vertex2 {

    private String name;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex2> neighbors;

    public Vertex2(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex2> getNeighbors() {
        return neighbors;
    }

    public void addNeighbors(Vertex2 neighborhood) {
        this.neighbors.add(neighborhood);
    }
}
