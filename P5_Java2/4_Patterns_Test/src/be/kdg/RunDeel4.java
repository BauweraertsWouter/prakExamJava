package be.kdg;

import be.kdg.patterns.Film;
import be.kdg.patterns.ObservableVerzameling;
import be.kdg.patterns.Verzameling;
import be.kdg.patterns.VerzamelingObserver;

/*
 * 2de zit examen Java2 - 18/08/2016
 *
 * Verwijder de commentaartekens om je code te stesten
 */
public class RunDeel4 {
    public static void main(String[] args) {

        Verzameling myCollection = Verzameling.getInstance();
        myCollection.add(new Film(2015,"Star Wars: The Force Awakens"));
        myCollection.add(new Film(2015,"The Martian"));
        myCollection.add(new Film(1998,"Psycho"));

        VerzamelingObserver observer = new VerzamelingObserver();
        ObservableVerzameling verzameling = new ObservableVerzameling();

        verzameling.addObserver(observer);

        verzameling.add(new Film(1960, "Psycho"));

    }
}

/*
2015 "Star Wars: The Force Awakens"
2015 "The Martian"
1998 "Psycho"
1960 "Psycho"
*/