package Lab4;

import java.util.*;

public class Kruskal {
    Queue<Edge> queueEdges = new PriorityQueue<>();
    ArrayList<Edge> MST = new ArrayList<>();
    ArrayList<Node> nodeList;
    ArrayList<Node> traversedNodes = new ArrayList<>();

    ArrayList<Edge> edgeList;

    public Kruskal(ArrayList<Node> nodeList, ArrayList<Edge> edgeList) {
        this.nodeList = nodeList;
        this.edgeList = edgeList;
    }
    public ArrayList<Edge> findKruskalsMST(ArrayList<Node> nodeList,ArrayList<Edge> edgeList){
        //ArrayList<> sortedEdges = new ArrayList[]{edgeList};
        Collections.sort(edgeList);
//        for (Edge edge : edgeList)  {
//            edge.printEdge();
//        }
        int i = 0;
        while(traversedNodes.size() != nodeList.size()) {

            Edge currentShortestEdge = edgeList.get(i);

            MST.add(currentShortestEdge);
            if(!traversedNodes.contains
                    (currentShortestEdge.getFrom())){
                traversedNodes.add(currentShortestEdge.getFrom());
            }
            if(!traversedNodes.contains
                    (currentShortestEdge.getTo())){
                traversedNodes.add(currentShortestEdge.getTo());
            }
            i++;
        }
        return MST;
    }

    public void printMST(ArrayList<Node> nodeList,ArrayList<Edge> edgeList){
        ArrayList<Edge> MST;
        MST = findKruskalsMST(nodeList,edgeList);
        System.out.println("Minimaltree");

        for (int i = 0; i < MST.size(); i++) {
            Edge currentEdge = MST.get(i);
            System.out.println(" " + nodeList.indexOf(currentEdge.getFrom()) + "-" + currentEdge.getWeight() + "->" + nodeList.indexOf(currentEdge.getTo()));
        }

    }


}
