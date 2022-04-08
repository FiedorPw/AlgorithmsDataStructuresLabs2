package Lab1;

import java.io.*;
import java.util.HashMap;

public class KolejkaPriorytetowa{
    String tekstStr;
    HashMap<String,Integer> hashMap = new HashMap<>();

    public void mostOccuringWord(){
        int currentWordLength = 0;
        String currentWord = "";
        int currentValue;
        for (int i = 0; i < tekstStr.chars().count(); i++) {
            if(tekstStr.charAt(i) == ' ' ||tekstStr.charAt(i) == '/' || tekstStr.charAt(i) == '\n'|| i == tekstStr.chars().count()-1){
                currentWord = tekstStr.substring(i-currentWordLength,i);
                if(hashMap.containsKey(currentWord)) {
                    currentValue = hashMap.get(currentWord);
                    hashMap.replace(currentWord,currentValue+1);

                }else hashMap.put(currentWord,1);
                currentWordLength = 0;
            }else{
                currentWordLength++;
            }
        }
        System.out.println(hashMap);
        //otrzymaną hashmape z ilośćią i jako wartość sortujemy
        //list.toArraylist
        SortMapByValue sortHM = new SortMapByValue();
        sortHM.printMap(sortHM.sortByValue(hashMap,false));
        //użycie dzikiej klasy sortującej
    }
    public void printLongestWord(){
        int longestWord = 0;
        int currentWordLength = 0;
        int miejsceWtekscie = 0;

        for (int i = 0; i < tekstStr.chars().count(); i++) {
            if(tekstStr.charAt(i) == ' ' ||tekstStr.charAt(i) == '/' || tekstStr.charAt(i) == '\n'|| i == tekstStr.chars().count()-1){
                if(longestWord < currentWordLength){
                    longestWord = currentWordLength;
                    miejsceWtekscie = i;
                }
                currentWordLength = 0;
            }else{
                currentWordLength++;
            }
        }
        System.out.println("longest word '" + tekstStr.substring(miejsceWtekscie-longestWord,miejsceWtekscie) + "' length " + longestWord);
    }
    public void fileReader() throws IOException {
        File file = new File("/home/kolaj/IdeaProjects/OperacjeNaPlikuTekstowym/src/testFile.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuffer stringBuffer = new StringBuffer();
        String line = "kkkkkkkkk";

        while ((line = bufferedReader.readLine()) != null) {
            stringBuffer.append(line);
            stringBuffer.append("\n");
        }
        fileReader.close();
        bufferedReader.close();
        tekstStr = stringBuffer.toString();
    }
    public void printShortestWord(){
        boolean liczenie = false;
        int shortestWord = 10;
        int currentWordLength = 0;
        int miejsceWtekscie = 0;

        for (int i = 0; i < tekstStr.chars().count(); i++) {
            if(tekstStr.charAt(i) == ' ' || i == tekstStr.chars().count()-1){
                if(shortestWord > currentWordLength){
                    shortestWord = currentWordLength;
                    miejsceWtekscie = i;
                }
                currentWordLength = 0;
            }else{
                currentWordLength++;
            }
        }
        System.out.println("shortest word '" + tekstStr.substring(miejsceWtekscie-shortestWord,miejsceWtekscie) + "' length " + shortestWord);
    }
}
