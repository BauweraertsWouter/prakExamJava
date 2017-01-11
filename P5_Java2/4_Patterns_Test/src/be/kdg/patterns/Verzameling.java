package be.kdg.patterns;

import java.util.ArrayList;
import java.util.List;

/*
 * 2de zit examen Java2 - 18/08/2016
 */

public final class Verzameling{
    // TODO Vul aan (4.1)
    private static Verzameling enigeVerzameling = new Verzameling();

    private List<Film> filmLijst;

    private Verzameling(){
        filmLijst = new ArrayList<>();
    }

    public void add(Film film){
        if (!filmLijst.contains(film)){
            filmLijst.add(film);
        }
    }

    public int aantalFilms(){
        return filmLijst.size();
    }

    public void print(){
        for (Film f : filmLijst){
            System.out.println(f.toString());
        }
    }

    public static synchronized Verzameling getInstance(){
        return enigeVerzameling;
    }

}
