package be.kdg.test;

// imports bewust verwijderd
import be.kdg.patterns.Film;
import be.kdg.patterns.Verzameling;
import org.junit.*;

import java.lang.annotation.Target;

import static org.junit.Assert.*;

/*
 * 2de zit examen Java2 - 18/08/2016
 */

// TODO Te schrijven klasse (4.4)
public class TestVerzameling {
    private Verzameling verzameling1;
    private Verzameling verzameling2;
    Film film1 = new Film(2016, "Rogue one");
    Film film2 = film1;

    @Before
    public void init(){
        verzameling1 = Verzameling.getInstance();
        verzameling2 = Verzameling.getInstance();
        film1 = new Film(2016, "Rogue one");
        film2 = film1;
    }

    @After
    public void breakUp(){
        verzameling1 = null;
        verzameling2 = null;
        film1 = null;
        film2 = null;
    }

    @Test
    public void singletonCorrectTest(){
        assertSame("Singleton niet correct toegepast. Verschillende instanties", verzameling1, verzameling2);
    }

    @Test
    public void testAddFilmTwice(){
        int count = 1;

        verzameling1.add(film1);
        verzameling2.add(film2);

        assertEquals(count, verzameling1.aantalFilms());
    }
}
