package Lab1;

import java.sql.Time;
import java.util.Objects;

public class Pacjent {
    int klasa;

    int czasZgloszenia;

    public Pacjent(int czasZgloszenia,int klasa) {
        this.czasZgloszenia = czasZgloszenia;
        this.klasa = klasa;
    }

    public int getKlasa() {
        return klasa;
    }

    public int getCzasZgloszenia() {
        return czasZgloszenia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pacjent)) return false;
        Pacjent pacjent = (Pacjent) o;
        return getKlasa() == pacjent.getKlasa() && getCzasZgloszenia() == pacjent.getCzasZgloszenia();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKlasa(), getCzasZgloszenia());
    }
}
