//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Lab5;
public class Coder {
    public Coder() {
    }

    static String code(String var0) {
        StringBuilder var1 = new StringBuilder();

        //dodaje znaki które sa zamieniane na ascii przez char
        for(int i = 0; i < var0.length(); ++i) {
            var1.append((char)(var0.charAt(i) + 1));
        }

        return var1.toString();
    }
}
