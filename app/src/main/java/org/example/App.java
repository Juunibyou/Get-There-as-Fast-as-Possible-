package org.example;

public class App {

    private static void testShortestPath(Graph g, int start, int end){
        int result = Dijkstra.shortestPath(g, start, end);

        if (result == -1) {
            System.out.println("No path exists from " + start + " to " + end);
        } else {
            System.out.println("Shortest path from " + start + " to " + end + " is " + result);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();

        for (int i = 1; i <= 5; i++) {
            graph.addNode(i);
        }

        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 3, 2);
        graph.addEdge(3, 5, 1);
        graph.addEdge(1, 4, 5);
        graph.addEdge(1, 5, 1);

        System.out.println("|_____DIJKSTRA ALGORITHM_____|\n");
        testShortestPath(graph, 1, 2);
        testShortestPath(graph, 1, 5);
        testShortestPath(graph, 2, 5);
        testShortestPath(graph, 5, 1);
        testShortestPath(graph, 2, 1);
    }
}
