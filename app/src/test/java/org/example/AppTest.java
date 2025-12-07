package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    private Graph buildGraph() {
        Graph graph = new Graph();

        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addNode(5);

        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 5, 1);
        graph.addEdge(2, 5, 3);

        return graph;
    }

    @Test
    public void test1to2() {
        Graph g = buildGraph();
        assertEquals(1, Dijkstra.shortestPath(g, 1, 2));
    }

    @Test
    public void test1to5() {
        Graph g = buildGraph();
        assertEquals(1, Dijkstra.shortestPath(g, 1, 5));
    }

    @Test
    public void test2to5() {
        Graph g = buildGraph();
        assertEquals(3, Dijkstra.shortestPath(g, 2, 5));
    }

    @Test
    public void test5to1() {
        Graph g = buildGraph();
        assertEquals(-1, Dijkstra.shortestPath(g, 5, 1));
    }

    @Test
    public void test2to1() {
        Graph g = buildGraph();
        assertEquals(-1, Dijkstra.shortestPath(g, 2, 1));
    }

    @Test   
    public void testInvalidNodes() {
        Graph g = buildGraph();
        assertEquals(-1, Dijkstra.shortestPath(g, 999, 1));
        assertEquals(-1, Dijkstra.shortestPath(g, 1, 999));
        assertEquals(-1, Dijkstra.shortestPath(g, -5, 7));
    }
}
