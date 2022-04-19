package Lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Graph {

    Node[] nodes;
    int[] edges;
    int firstNode;
    int secondNode;

    public static void main(String[] args){
       Graph graph = new Graph(8);
       graph.readGraph();
       graph.printNodes();


    }
    public Graph(int size) {



    }
    public void readGraph(){
        try {
            int numberOfVerticies = 0;
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
                    nodes = new Node[numberOfVerticies];
                  }else if (i == 1){
                    numberOfEdges = Integer.parseInt(line);
                    edges = new int[numberOfEdges];
                  }
                i++;

            }
            fileReader.close();
            bufferedReader.close();
            String graphString = stringBuffer.toString();

        } catch (Exception e) {
            System.out.println("sypa z czytaniem");
        }

    }
    public void createVerticies(String vertis){

        char firstNodech = vertis.charAt(0);
        char secondNodech = vertis.charAt(2);
        firstNode = Character.getNumericValue(firstNodech);
        secondNode = Character.getNumericValue(secondNodech);
        System.out.println(firstNode + " " + secondNode );
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
        for (int i = 0; i < nodes.length; i++) {

            System.out.print(i + ": " );
            for (int edge:nodes[i].edges) {
                System.out.print(edge + " ");
            }
            System.out.println();

        }
    }

    public class pathFinder{


    }
}
