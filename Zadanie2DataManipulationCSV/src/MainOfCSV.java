import java.io.IOException;
import java.util.Scanner;

public class MainOfCSV {
    Object[] mainArr;
    public static void main(String[] args) throws IOException {
        String pathToCSV = "StudentsPerformance.csv";
        CSVreader csvreader = new CSVreader();
        String[][] mainArray = csvreader.readCSV(pathToCSV);
        //System.out.println(mainArray[1][0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("pick column to analyse");

        for (int i = 0; i < mainArray[0].length; i++) {
            System.out.println(i + ":" + mainArray[0][i]);
        }
        System.out.println("666:to exit");


        StringOperations stringOperations = new StringOperations(mainArray,2);
        stringOperations.amoutOfOptions();
        stringOperations.percents();

        IntOperations intOperations = new IntOperations(mainArray,6);
        intOperations.maxValue();
        intOperations.minvalue();



        int answer = 0;
        loop: while(true){
            answer = scanner.nextInt();
            switch (answer){
                case 666:break loop;
                case 1: System.out.println("duuuupa");

            }
        }
    }

}
