package br.com.vinicius.study.dfs;

import br.com.vinicius.study.model.Vertex;

import java.util.ArrayList;
import java.util.List;

public class DfsApp {

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");

        a.addNeighbors(b);
        a.addNeighbors(c);

        c.addNeighbors(d);
        d.addNeighbors(e);
        e.addNeighbors(f);

        List<Vertex> vertexList = new ArrayList<>();
        vertexList.add(a);
        vertexList.add(b);
        vertexList.add(c);
        vertexList.add(d);
        vertexList.add(e);
        vertexList.add(f);

        dfs.execute(vertexList);
    }
}
