package Lab4;

import java.util.ArrayList;

public class Edge{
    Node to;
    Node from;
    int weight;
    ArrayList<Edge> edges = new ArrayList<>();

    public Edge(Node from, int weight, Node to) {
        this.to = to;
        this.from = from;
        this.weight = weight;
    }

    public Node getTo() {
        return to;
    }

    public Node getFrom() {
        return from;
    }

    public int getWeight() {
        return weight;
    }
}

