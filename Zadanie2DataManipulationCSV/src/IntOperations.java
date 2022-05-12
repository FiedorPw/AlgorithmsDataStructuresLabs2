import java.util.ArrayList;
import java.util.HashMap;

public class IntOperations {
    HashMap<String,Integer> hashMap = new HashMap<>();
    ArrayList<String> posibleStates = new ArrayList<>();
    String[][] mainArray;
    int[] array;
    int column;
    int total;
    String header;

    public IntOperations(String[][] mainArray, int column) {
        this.mainArray = mainArray;
        this.column = column;
        total = mainArray.length - 1;
        array = new int[total + 1];
        String header = mainArray[0][column];
        //zamiana stringów na inty, wyrzucanie " "
        for (int i = 1; i < mainArray.length; i++) {
            String currentElement = mainArray[i][column];
            String currentTrimed = currentElement.replaceAll("\"","");
            array[i] = Integer.parseInt(currentTrimed);
        }


        //        for (int i = 1; i < mainArray.length; i++) {
//            String currentElement = mainArray[i][column];
//            if (hashMap.containsKey(currentElement)) {
//                hashMap.replace(currentElement, hashMap.get(currentElement) + 1);
//            } else {
//                hashMap.put(currentElement, 1);
//                posibleStates.add(currentElement);
//            }
//        }
    }
    public void maxValue() {
        int biggest = 0;
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            if (biggest < currentElement) {
                biggest = currentElement;
            }
        }
        System.out.println("\nbiggest value: " + biggest);
    }

    public void minvalue() {
        int smallest = 0;
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            if (smallest > currentElement) {
                smallest = currentElement;
            }
        }
        System.out.println("\nsmallest value: " + smallest);
    }


}
