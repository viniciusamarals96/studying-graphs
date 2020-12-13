package br.com.vinicius.study.cycleDetection;

import br.com.vinicius.study.model.Vertex;
import br.com.vinicius.study.model.Vertex2;

import java.util.ArrayList;
import java.util.List;

public class CycleApp {

    public static void main(String[] args) {

        Vertex2 v1 = new Vertex2("1");
        Vertex2 v2 = new Vertex2("2");
        Vertex2 v3 = new Vertex2("3");
        Vertex2 v4 = new Vertex2("4");
        Vertex2 v5 = new Vertex2("5");
        Vertex2 v6 = new Vertex2("6");

        v1.addNeighbors(v2);
        v1.addNeighbors(v3);
        v2.addNeighbors(v3);
        v4.addNeighbors(v1);
        v4.addNeighbors(v5);
        v5.addNeighbors(v4);
        v6.addNeighbors(v4);

        List<Vertex2> vertex2List = new ArrayList<>();
        vertex2List.add(v1);
        vertex2List.add(v2);
        vertex2List.add(v3);
        vertex2List.add(v4);
        vertex2List.add(v5);
        vertex2List.add(v6);

        CycleDetection cycleDetection = new CycleDetection();
        cycleDetection.cycleDetection(vertex2List);
    }
}
