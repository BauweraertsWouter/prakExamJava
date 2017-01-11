package be.kdg.concurrency;

/*
 * 2de zit examen Java2 - 18/08/2016
 * AAN DEZE KLASSE MAG JE NIETS WIJZIGEN
 */
public class Persoon implements Comparable<Persoon> {
    @Override
    public int compareTo(Persoon o) {
        return this.getLeeftijd() - o.getLeeftijd();
    }

    public enum Geslacht { MAN, VROUW };

    private String naam;
    private Geslacht sekse;
    private int leeftijd;
    private double loon;

    public Persoon(String naam, Geslacht sekse, int leeftijd, double loon) {
        this.naam = naam;
        this.sekse = sekse;
        this.leeftijd = leeftijd;
        this.loon = loon;
    }

    public String getNaam() {
        return naam;
    }

    public Geslacht getSekse() {
        return sekse;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public double getLoon() {
        return loon;
    }

    @Override
    public String toString() {
        return String.format("%-20s %5s %4d €%.2f", naam, sekse, leeftijd, loon);
    }
}
