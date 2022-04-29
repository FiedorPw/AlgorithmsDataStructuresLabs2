package Lab4;

import java.util.ArrayList;

public class Edge implements Comparable<Edge> {
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

    public void printEdge() {
        System.out.println(" " + from + "-" + weight + "->" + to);
    }

//    @Override
//    public int compareTo(Edge o) {
//        if (this.getWeight() == o.getWeight()) return 0;
//        else if(this.getWeight() > o.getWeight()) return 1;
//        else  return -1;
//    }

    public int compareTo(Edge compareFruit) {

        int compareQuantity = ((Edge) compareFruit).getWeight();

        //ascending order
        return this.getWeight() - compareQuantity;

        //descending order
        // return compareQuantity - this.getWeight();

    }
}
