package br.com.vinicius.study.dijkstra;

import java.util.*;

public class ShortestPath {

	public void computePaths(Vertex sourceVertex){

		sourceVertex.setDistance(0);
		PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);

		while (!priorityQueue.isEmpty()){
			Vertex actual = priorityQueue.poll();

			for (Edge edge : actual.getAdjacenciesList()) {
				Vertex vertex = edge.getTargetVertex();
				double newDistance = actual.getDistance() + edge.getWeight();

				if(newDistance < vertex.getDistance()){
					priorityQueue.remove(vertex);
					vertex.setDistance(newDistance);
					vertex.setPredecessor(actual);
					priorityQueue.add(vertex);
				}
			}
		}
	}
	
	public List<Vertex> getShortestPathTo(Vertex targetVertex){
		List<Vertex> shortestPathToTarget = new ArrayList<>();
		for(Vertex vertex = targetVertex; vertex != null; vertex = vertex.getPredecessor()){
			shortestPathToTarget.add(vertex);
		}

		Collections.reverse(shortestPathToTarget);
		return shortestPathToTarget;
	}
}
