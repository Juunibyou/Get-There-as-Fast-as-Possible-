package org.example;

import java.util.*;

public class Graph {
    private Map<Integer, List<Edge>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addNode(int node){
        adjList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(int from, int to, int weight) {
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());
        adjList.get(from).add(new Edge(to, weight));
    }

    public List<Edge> getNexts (int node) {
        return adjList.getOrDefault(node, Collections.emptyList());
    }

    public Set<Integer> getNodes() {
        return adjList.keySet();
    }
}
