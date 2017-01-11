package be.kdg.annotations;

/*
 * 2de zit examen Java2 - 18/08/2016
 * HIER MAG JE NIETS AAN WIJZIGEB!
 * De rode lijnen verdwijnen automatisch als je de annotation correct geschreven hebt!
 */
public class Programmer {
    private int nummer;
    private String naam;
    private String team;

    public Programmer(int nummer, String naam, String team) {
        this.nummer = nummer;
        this.naam = naam;
        this.team = team;
    }

    @Refactored(value = "Jos", count = 3)
    public int getNummer() {
        return nummer;
    }

    @Refactored(value = "Erik", count = 2)
    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Refactored(value = "Jos", count = 2)
    public String getNaam() {
        return naam;
    }

    @Refactored(value = "Erik", count = 1)
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Refactored(value = "Staf", count = 2)
    public String toString() {
        return String.format("Piloot: %2d %-20s %-20s", nummer, naam, team);
    }
}
