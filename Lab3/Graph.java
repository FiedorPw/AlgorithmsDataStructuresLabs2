package Lab3;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Graph {

    Node[] nodes;
    int[] edges;
    int firstNode;
    int secondNode;
    int numberOfVerticies = 0;
    int pointer = 1;
    int endPointer = 0;
    Node[] traversedNodes;

    public static void main(String[] args){

        Graph graph = new Graph();
        graph.readGraph();
        graph.printNodes();
        graph.printRoute(0,5);
        graph.printRoute(0,2);



    }

    public void readGraph(){
        try {

            int numberOfEdges = 0;
            File file = new File("/home/kolaj/IdeaProjects/apro2_22l_fiedorczuk_mikolaj/Lab3/graph.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                if(i > 1) {
                    createVerticies(line);
                  }else if (i == 0){
                    numberOfVerticies = Integer.parseInt(line);
                    nodes = new Node[numberOfVerticies]; //ustawianie wielkosci arraya
                    traversedNodes = new Node[numberOfVerticies+2]; //ustawianie arraya dla metody find
                  }else if (i == 1){
                    numberOfEdges = Integer.parseInt(line);
                    edges = new int[numberOfEdges];
                  }
                i++;

            }
            fileReader.close();
            bufferedReader.close();

        } catch (Exception e) {
            System.out.println("sypa z czytaniem");
        }

    }
    public void createVerticies(String vertis){

        char firstNodech = vertis.charAt(0);
        char secondNodech = vertis.charAt(2);
        firstNode = Character.getNumericValue(firstNodech);
        secondNode = Character.getNumericValue(secondNodech);
      // System.out.println(firstNode + " " + secondNode );
        if(nodes[firstNode] == null){
            nodes[firstNode] = new Node();
        }
        if(nodes[secondNode] == null) {
            nodes[secondNode] = new Node();
        }
        nodes[secondNode].addVerticies(firstNode);
        nodes[firstNode].addVerticies(secondNode);
    }

    public void printNodes(){
        System.out.println("structure of a graph");
        for (int i = 0; i < nodes.length; i++) {

            System.out.print(i + ": " );
            for (int edge:nodes[i].edges) {
                System.out.print(edge + " ");
            }
            System.out.println();

        }
    }
    public void printRoute(int start,int finish){
        pointer = 1;
        endPointer = 0;
        findPath(start,finish);
        Node currentNode = traversedNodes[finish];
        List<Node> arrayListNodes  = Arrays.asList(nodes);
        ArrayList<Integer> listToReverse = new ArrayList<>();
        System.out.print("\nroute from " + start + " to " + finish + ": " + start);
        while(currentNode != nodes[start] ){
            listToReverse.add(arrayListNodes.indexOf(currentNode));
           int currentParent= currentNode.parent;
            currentNode = nodes[currentParent];
        }
        Collections.reverse(listToReverse);
        for (int item:
             listToReverse) {
            System.out.print("->" + item  );
        }


    }
    private void findPath(int start,int finish){


        if(start == finish){
            return;
        }

        traversedNodes[endPointer] = nodes[start];
        for (int edge:nodes[start].edges) {
            if(edge != nodes[start].parent) {
                traversedNodes[pointer] = nodes[edge];
                traversedNodes[pointer].setParent(start);
                pointer++;
            }
        }
        endPointer++;
        findPath(endPointer,finish);


    }

}
