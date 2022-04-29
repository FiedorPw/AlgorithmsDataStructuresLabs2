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
        if (input.length != 1) {
            System.out.println("Wrong password!");
        } else {
            String var1 = input[0];
            String[] tablicaInputow = var1.split("_");
            Date czasOdTeraz = Date.from(Instant.now());
            SimpleDateFormat lata = new SimpleDateFormat("yyyy");
            String JakisCzas = lata.format(czasOdTeraz);
            int var6 = Integer.parseInt(JakisCzas);
            if (tablicaInputow[0].length() == 7 && tablicaInputow[1].length() == 4) {
                if (tablicaInputow[0].equals(Coder.code("u78GRZ6")) && Integer.parseInt(tablicaInputow[1]) == var6) {
                    System.out.println("Good guess");
                } else {
                    System.out.println("Wrong password!");
                }
            } else {
                System.out.println("Wrong password!");
            }

        }



    }
}
