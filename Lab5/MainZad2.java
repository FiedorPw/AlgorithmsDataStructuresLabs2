package Lab5;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class MainZad2 {

    public MainZad2() {



    }

    public static void main(String[] input) {

        if (input.length != 1) {   //sprawdza czy podano jeden argumet
            System.out.println("Wrong password!");
        } else {
            String var1 = input[0];
            String[] inputString = var1.split("_");
            Date czasOdTeraz = Date.from(Instant.now());
            SimpleDateFormat lata = new SimpleDateFormat("yyyy");
            String JakisCzas = lata.format(czasOdTeraz);
            int var6 = Integer.parseInt(JakisCzas);

            if (inputString[0].length() == 7 && inputString[1].length() == 4) {
                if (inputString[0].equals(Coder.code("u78GRZ6")) && Integer.parseInt(inputString[1]) == var6) {
                    System.out.println("Good guess");
                } else {
                    System.out.println("Wrong password!");
                }
            } else {
                System.out.println("Wrong password!");
            }
            System.out.println(Coder.code("u78GRZ6"));
            System.out.println(Integer.parseInt(inputString[1]));
        }



    }
}
