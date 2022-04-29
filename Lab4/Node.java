package Lab4;


import java.util.ArrayList;

public class Node {
    ArrayList<Edge> edges = new ArrayList<>();
    public void addEdge(Edge edge) {
        edges.add(edge);
    }
}
