package br.com.vinicius.study.model;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighbors;

    public Vertex(String name) {
        this.name = name;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void addNeighbors(Vertex neighborhood) {
        this.neighbors.add(neighborhood);
    }
}
