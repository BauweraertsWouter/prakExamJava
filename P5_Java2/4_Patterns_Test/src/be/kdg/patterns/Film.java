package be.kdg.patterns;

import java.util.Objects;

/**
 * 2de zit examen Java2 - 18/08/2016
 * DEZE KLASSE MAG NIET GEWIJZIGD WORDEN!
 */
public class Film {
    private int jaar;
    private String titel;

    public Film(int jaar, String titel) {
        this.jaar = jaar;
        this.titel = titel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return jaar == film.jaar &&
                Objects.equals(titel, film.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jaar, titel);
    }

    @Override
    public String toString() {
        return String.format("%4d \"%s\"", jaar, titel);
    }
}
