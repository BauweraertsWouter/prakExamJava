package be.kdg.model;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Objects;

/*
 * 2de zit examen Java2 - 18/08/2016
 */
@XmlType(propOrder = {"nummer", "soort", "iso", "diafragma", "sluitertijd"})
@XmlRootElement(name = "foto")
public class Foto {
    private int nummer;
    private Soort soort;
    private double diafragma;
    private String sluitertijd;
    private int iso;

    public Foto() {
    }

    public Foto(int nummer, Soort soort, double diafragma, String sluitertijd, int iso) {
        this.nummer = nummer;
        this.soort = soort;
        this.diafragma = diafragma;
        this.sluitertijd = sluitertijd;
        this.iso = iso;
    }

    @XmlElement(name = "nummer")
    public int getNummer() {
        return nummer;
    }

    @XmlElement(name = "soort")
    public Soort getSoort() {
        return soort;
    }

    @XmlElement(name = "diafragma")
    public double getDiafragma() {
        return diafragma;
    }

    @XmlElement(name = "sluitertijd")
    public String getSluitertijd() {
        return sluitertijd;
    }

    @XmlElement(name = "iso")
    public int getIso() {
        return iso;
    }


    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setSoort(Soort soort) {
        this.soort = soort;
    }

    public void setDiafragma(double diafragma) {
        this.diafragma = diafragma;
    }

    public void setSluitertijd(String sluitertijd) {
        this.sluitertijd = sluitertijd;
    }

    public void setIso(int iso) {
        this.iso = iso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foto foto = (Foto) o;
        return nummer == foto.nummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummer);
    }

    @Override
    public String toString() {
        return String.format("%05d %s %4.1f %-6s %4d", nummer, (soort == Soort.ACTION ? "A" : "P"), diafragma, sluitertijd, iso);
    }
}
