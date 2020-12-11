package br.com.vinicius;

import br.com.vinicius.model.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void traverse(Vertex root){
        Queue<Vertex> queue = new LinkedList<>();
        root.setVisited(true);

        queue.add(root);

        while (!queue.isEmpty()){
            Vertex actual = queue.remove();

            System.out.println("Actual visited vertex " + actual.toString());

            for (Vertex v : actual.getNeighborhood()){
                if(!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
