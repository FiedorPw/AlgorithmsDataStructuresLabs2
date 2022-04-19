package Lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GraphReader {
    public String readForGraph() {
        try {
            File file = new File("/home/kolaj/IdeaProjects/apro2_22l_fiedorczuk_mikolaj/Lab3/graph.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            bufferedReader.close();
            String xmlString = stringBuffer.toString();
            return xmlString;
        } catch (Exception e) {
            System.out.println("sypa z czytaniem");
        }
        return null;
    }






}