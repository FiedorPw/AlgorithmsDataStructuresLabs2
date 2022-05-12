import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class StringOperations {
    HashMap<String,Integer> hashMap = new HashMap<>();
    ArrayList<String> posibleStates = new ArrayList<>();
    String[][] mainArray;
    int column;
    int total;
    StringOperations(String[][] mainArray,int column){
        this.column = column;
        this.mainArray = mainArray;
        total = mainArray.length - 1;
        for (int i = 1; i < mainArray.length; i++) {
            String currentElement = mainArray[i][column];
            if (hashMap.containsKey(currentElement)) {
                hashMap.replace(currentElement, hashMap.get(currentElement) + 1);
            } else {
                hashMap.put(currentElement, 1);
                posibleStates.add(currentElement);
            }
        }
    }

    public void amoutOfOptions(){
        System.out.println("\n" + mainArray[0][column]);
        for (String currentKey: posibleStates) {
            System.out.println(currentKey + ": " + hashMap.get(currentKey));
        }
        System.out.println("in total:" + total);
    }
    public void percents(){
        System.out.println("\n" + mainArray[0][column]);
        for (String currentKey: posibleStates) {
            System.out.println(currentKey + ": " + toPercent(hashMap.get(currentKey),total));
        }
    }

    private String toPercent(int dzielna,int dzielnik){
        float percent = (float)(dzielna)/(float)(dzielnik);
        percent *= 100;
        int newPercent = (int)percent;
        return String.valueOf(newPercent) + "%";

    }


}
