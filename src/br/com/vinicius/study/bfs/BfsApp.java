package br.com.vinicius.study.bfs;

import br.com.vinicius.study.model.Vertex;

public class BfsApp {

    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbors(b);
        a.addNeighbors(f);
        a.addNeighbors(g);

        b.addNeighbors(a);
        b.addNeighbors(c);
        b.addNeighbors(d);

        c.addNeighbors(b);

        d.addNeighbors(b);
        d.addNeighbors(e);

        f.addNeighbors(a);

        g.addNeighbors(a);
        g.addNeighbors(h);

        h.addNeighbors(g);

        bfs.traverse(a);
    }
}
