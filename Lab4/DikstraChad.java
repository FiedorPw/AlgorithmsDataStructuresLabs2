//package Lab4;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//public class DikstraChad {
//
//
//        int distanceTostart =0;
//        Queue<Edge> queue = new PriorityQueue<>();
//        ArrayList<Edge>  = new ArrayList<>();
//        ArrayList<Node> nodeList;
//        ArrayList<Node> visitedNodes = new ArrayList<>();
//        ArrayList<Node> unvisitedNodes = new ArrayList<>();
//        ArrayList<Integer> ListToSort = new ArrayList<Integer>();
//        Node startingNode;
//        ArrayList<Edge> edgeList;
//
//        public DikstraChad(Node startingNode, ArrayList<Node> nodeList, ArrayList<Edge> edgeList) {
//            this.nodeList = nodeList;
//            this.edgeList = edgeList;
//            this.startingNode = startingNode;
//        }
//        //MST-minimal spaning tree
//        public ArrayList<Edge> findDikstraMST(ArrayList<Node> nodeList,ArrayList<Edge> edgeList){
//            this.nodeList = nodeList;
//            this.edgeList = edgeList;
//            Node currentNode = nodeList.get(0);
//            //traversedNodes.add(nodeList.get(0));
//            do {
//                for (Edge edge:currentNode.edges) {
//                    //&& !traversedNodes.contains(edge.getFrom()))
//                    if(!visitedNodes.contains(edge.getTo()))  {
//                        queue.add(edge);
//                    }                                                                                                                                               //else queue.remove(edge);
//                }
//                for (Edge edge: queue) {
//                    ListToSort.add(edge.getWeight() + distanceTostart);
//
//                }
//                distanceTostart = ListToSort.get(0);
//
//                visitedNodes.add(queue.peek().getFrom());
//                Path.add(queue.peek());
//                currentNode = queue.poll().getTo();
//                visitedNodes.add(currentNode);
//                unvisitedNodes.remove(currentNode);
//                queue.remove(queue.poll());
//
//            }while(visitedNodes.size()!= nodeList.size());
//
//
//
//            return Path;
//        }
//        public void printDikstraMST(ArrayList<Node> nodeList,ArrayList<Edge> edgeList){
//            ArrayList<Edge> MST;
//            MST = findDikstraMST(nodeList,edgeList);
//            for (int i = 0; i < MST.size(); i++) {
//                Edge currentEdge = MST.get(i);
//                System.out.println(" " + nodeList.indexOf(currentEdge.getFrom()) + "-" + currentEdge.getWeight() + "->" + nodeList.indexOf(currentEdge.getTo()));
//            }
//
//        }
//
//
//
//    }
//
//
//
