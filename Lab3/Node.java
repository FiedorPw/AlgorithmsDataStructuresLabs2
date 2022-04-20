package Lab3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Node {
    ArrayList<Integer> edges = new ArrayList<>();
    int parent;

    void addVerticies(int index ){
        edges.add(index);
    }

    public void setParent(int parent) {
        this.parent = parent;
    }

    public static void main(String[] args){

    }




}
