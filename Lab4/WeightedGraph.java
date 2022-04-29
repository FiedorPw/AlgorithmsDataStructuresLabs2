//package Lab4;
//
//import java.util.ArrayList;
//
//public class WeightedGraph {
//    ArrayList<Node> nodeList = new ArrayList<>();
//    ArrayList<Edge> edgeList = new ArrayList<>();
//
//    public static void main(String[] args){
//        GraphReader graphReader = new GraphReader();
//        graphReader.readGraph();
//        WeightedGraph weightedGraph = new WeightedGraph();
//        weightedGraph.addNode(5);
//        weightedGraph.addEdge(1,1,2);
//        weightedGraph.addEdge(1,69,3);
//        weightedGraph.addEdge(2,3,3);
//        weightedGraph.addEdge(0,7,1);
//        weightedGraph.addEdge(2,2,4);
//
//        weightedGraph.printNodes();
//        Prim prim = new Prim(weightedGraph.nodeList,weightedGraph.edgeList);
//        prim.printMST(weightedGraph.nodeList,weightedGraph.edgeList);
////        Kruskal kruskal = new Kruskal(weightedGraph.nodeList,weightedGraph.edgeList);
////        kruskal.printMST(weightedGraph.nodeList,weightedGraph.edgeList);
//
//    }
//    public void addNode(int amount){
//        for (int i = 0; i < amount; i++) {
//            nodeList.add(new Node());
//        }
//    }
//    void addEdge(int from,int weight,int to){
//        Edge newEdge = new Edge(
//                nodeList.get(from), //node początkowy pobierany z arraylisty
//                weight,
//                nodeList.get(to));
//
//        nodeList.get(from).
//                addEdge(newEdge);
//        edgeList.add(newEdge);
//    }
//
//    public void printNodes(){
//        System.out.println("structure of a weighted graph");
//        for (int i = 0; i < nodeList.size(); i++) {
//
//            System.out.print(i + ": " );
//            for (Edge edge:nodeList.get(i).edges) {
//                Node tmpTo = edge.getTo();
//                System.out.print(
//                        "-"  +
//                        edge.getWeight() +
//                        "-> " +
//                        nodeList.indexOf(tmpTo)  +
//                        "|" );
//            }
//            System.out.println();
//
//        }
//    }
//}
