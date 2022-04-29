package Lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphReader {
    ArrayList<Lab4.Node> nodeList = new ArrayList<>();
    ArrayList<Edge> edgeList = new ArrayList<>();
    int[] edgesAmount;
    Lab4.Node[] nodesAmount;
    int numberOfnodes;

    public void readGraph() {
        try {

            int numberOfEdges = 0;
            File file = new File("g8.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            int i = 0;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                if (i > 1) {
                    createEdges(line);
                } else if (i == 0) {

                    numberOfnodes = Integer.parseInt(line);
                    nodesAmount = new Lab4.Node[numberOfnodes]; //ustawianie wielkosci arraya
                    //traversedNodes = new Node[numberOfVerticies+2]; //ustawianie arraya dla metody find
                } else if (i == 1) {
                    numberOfEdges = Integer.parseInt(line);
                    edgesAmount = new int[numberOfEdges];
                }
                i++;

            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("sypa z czytaniem");
        }
    }

    public void createEdges(String line) {
        Scanner scanner = new Scanner(line);
        int from = scanner.nextInt();
        line.replaceAll(String.valueOf(from), " ");

        int to = scanner.nextInt();
        line.replaceAll(String.valueOf(to), " ");

        Double weight = scanner.nextDouble();
        //
//        if()
//
//
//
//        Edge edge = new Edge()


//        char secondNodech = line.charAt(2);
//        firstNode = Character.getNumericValue(firstNodech);
//        secondNode = Character.getNumericValue(secondNodech);
//        // System.out.println(firstNode + " " + secondNode );
//        if(nodes[firstNode] == null){
//            nodes[firstNode] = new Node();
//        }
//        if(nodes[secondNode] == null) {
//            nodes[secondNode] = new Node();
//        }
//        nodes[secondNode].addVerticies(firstNode);
//        nodes[firstNode].addVerticies(secondNode);
    }
}