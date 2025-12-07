package org.example;

import java.util.*;

public class Dijkstra {

    public static int shortestPath(Graph graph, int start, int end) {
        Map <Integer, Integer> distances = new HashMap<>();
        
        for (int n : graph.getNodes()) {
            distances.put(n, Integer.MAX_VALUE);
        }

        distances.put(start, 0);

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentId = current.getId();
            int currentDist = current.getDistance();

            if (currentDist > distances.get(currentId)) {
                continue;
            }

            for (Edge edge : graph.getNexts(currentId)) {
                int neighbor = edge.getTo();
                int newDist = currentDist + edge.getWeight();

                if (newDist < distances.get(neighbor)) {
                    distances.put(neighbor, newDist);
                    pq.add(new Node(neighbor, newDist));
                }
            }
        }

        return -1;
    }
}
