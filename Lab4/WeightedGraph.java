package Lab4;

import java.util.ArrayList;

public class WeightedGraph {
    ArrayList<Node> nodeList = new ArrayList<>();
    ArrayList<Edge> edgeList = new ArrayList<>();

    public void addNode(int amount){
        for (int i = 0; i < amount; i++) {
            nodeList.add(new Node());
        }
    }
    void addEdge(int from,int weight,int to){
        Edge newEdge = new Edge(
                nodeList.get(from), //node początkowy pobierany z arraylisty
                weight,
                nodeList.get(to));

        nodeList.get(from).
                addEdge(newEdge);
        edgeList.add(newEdge);
    }
    public void printNodes(){
        System.out.println("structure of a weighted graph");
        for (int i = 0; i < nodeList.size(); i++) {

            System.out.print(i + ": " );
            for (Edge edge:nodeList.get(i).edges) {
                Node tmpTo = edge.getTo();
                System.out.print(
                        "-"  +
                        edge.getWeight() +
                        "-> " +
                        nodeList.indexOf(tmpTo)  +
                        "|" );
            }
            System.out.println();

        }
    }

    public static void main(String[] args){
        WeightedGraph weightedGraph = new WeightedGraph();
        weightedGraph.addNode(5);
        weightedGraph.addEdge(1,3,2);
        weightedGraph.addEdge(1,69,3);
        weightedGraph.addEdge(1,54,1);
        weightedGraph.addEdge(2,3,3);
        weightedGraph.addEdge(3,3,1);
        weightedGraph.printNodes();

    }
}
