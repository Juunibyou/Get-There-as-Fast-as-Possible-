package org.example;

public class Node implements Comparable<Node> {
    int value;
    int distance;

    Node(int value, int distance) {
        this.value = value;
        this.distance = distance;
    }   

    public int getId() {
        return value;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}
