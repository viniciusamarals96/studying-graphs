package br.com.vinicius.model;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;
    private boolean visited;
    private List<Vertex> neighborhood;

    public Vertex(String name) {
        this.name = name;
        this.visited = false;
        this.neighborhood = new ArrayList<>();
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

    public List<Vertex> getNeighborhood() {
        return neighborhood;
    }

    public void addNeighboords(Vertex neighborhood) {
        this.neighborhood.add(neighborhood);
    }
}
