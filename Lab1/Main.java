package Lab1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ListaPacjentów lista = new ListaPacjentów();
        Random random = new Random();
        int klasa;
        int czas;
        for (int i = 0; i < 15; i++) {
            klasa = random.nextInt(4) + 1;
            czas = i;
            lista.dodajPacjenta(czas,klasa);
        }

        lista.printList();
        lista.usuńPierwszegoPacjenta();
        lista.printList();
    }
}
