package Lab3;

import java.util.LinkedList;

public class Node {
    LinkedList<Node> edges = new LinkedList<Node>();
    int index;

    void addVerticies(Node node){
        edges.add(node);
    }

    public Node(int index, Node edge) {
        this.index = index;
        edges.add(edge);
    }

    public static void main(String[] args){

    }




}
