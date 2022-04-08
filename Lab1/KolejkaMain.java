package Lab1;

import java.io.IOException;

public class KolejkaMain {
    public static void main(String[] args) throws IOException {
        KolejkaPriorytetowa kolejka = new KolejkaPriorytetowa();
        kolejka.fileReader();
        kolejka.printLongestWord();
        kolejka.printShortestWord();
        kolejka.mostOccuringWord();

    }


}
