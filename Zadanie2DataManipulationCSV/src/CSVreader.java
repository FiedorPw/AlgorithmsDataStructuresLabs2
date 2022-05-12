import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVreader {
    public String[][] readCSV(String pathToFile) throws IOException {
        String line = "df";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToFile));
        List<String[]> lines = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line.split(","));
            //System.out.println(line);
        }

        // convert our list to a String array.
        String[][] array = new String[lines.size()][0];
        lines.toArray(array);
        return array;
    }






    public String[] headerReadCSV(String pathToFile){

        return new String[0];
    }


}
