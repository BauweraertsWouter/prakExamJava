package be.kdg.patterns;

import java.util.Observable;

/**
 * Created by Wouter on 10/01/2017.
 */
public class ObservableVerzameling extends Observable{
    private Verzameling verzameling;

    public ObservableVerzameling(){
        verzameling = Verzameling.getInstance();
    }

    public void add(Film film){
        int count = aantalFilms();
        verzameling.add(film);
        if (count < aantalFilms()){
            setChanged();
            notifyObservers();
        }
    }

    public int aantalFilms(){
        return verzameling.aantalFilms();
    }

    public void print(){
        verzameling.print();
    }
}
