//package Lab4;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class Prim {
//    Queue<Edge> queue = new PriorityQueue<>();
//    ArrayList<Edge> MST = new ArrayList<>();
//    ArrayList<Node> nodeList;
//    ArrayList<Node> traversedNodes = new ArrayList<>();
//
//    ArrayList<Edge> edgeList;
//
//    public Prim(ArrayList<Node> nodeList, ArrayList<Edge> edgeList) {
//        this.nodeList = nodeList;
//        this.edgeList = edgeList;
//    }
//    //MST-minimal spaning tree
//    public ArrayList<Edge> findMST(ArrayList<Node> nodeList,ArrayList<Edge> edgeList){
//        this.nodeList = nodeList;
//        this.edgeList = edgeList;
//        Node currentNode = nodeList.get(0);
//                                                                                                                                                //traversedNodes.add(nodeList.get(0));
//        do {
//            for (Edge edge:currentNode.edges) {
//                                                                                                                                                //&& !traversedNodes.contains(edge.getFrom()))
//                if(!traversedNodes.contains(edge.getTo()))  {
//                    queue.add(edge);
//                }                                                                                                                                               //else queue.remove(edge);
//            }
//            for (Edge edge: queue) {
//                edge.printEdge();
//            }
//      //      traversedNodes.add(queue.peek().getFrom());
//            MST.add(queue.peek());
//            currentNode = queue.poll().getTo();
//            queue.remove(queue.poll());
//
//        }while(traversedNodes.size()!= nodeList.size());
//
//
//
//        return MST;
//    }
//    public void printMST(ArrayList<Node> nodeList,ArrayList<Edge> edgeList){
//        ArrayList<Edge> MST;
//        MST = findMST(nodeList,edgeList);
//        for (int i = 0; i < MST.size(); i++) {
//            Edge currentEdge = MST.get(i);
//            System.out.println(" " + nodeList.indexOf(currentEdge.getFrom()) + "-" + currentEdge.getWeight() + "->" + nodeList.indexOf(currentEdge.getTo()));
//        }
//
//    }
//
//
//
//}
