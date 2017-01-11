package be.kdg;

import be.kdg.data.Data;
import be.kdg.model.Foto;
import be.kdg.model.Soort;
import be.kdg.parsing.ParsingTools;

import java.util.Comparator;
import java.util.List;

/*
 * 2de zit examen Java2 - 18/08/2016
 */

public class RunDeel3 {
    private static final String FILENAME = "portfolio.xml";

    public static void main(String[] args) {
        List<Foto> fotoList = Data.getList();
        ParsingTools.maakXML(fotoList, FILENAME); // Creatie xml bestand

        List<Foto> myList = ParsingTools.leesXML(FILENAME); // Lezen xml bestand
        System.out.println("Alle foto's uit XML-file:");
        // TODO Aan te vullen (3.3)
        myList.stream().forEach(System.out::println);

        System.out.println("\nAlle action foto's volgens nummer (zonder dubbels):");
        // TODO Aan te vullen (3.4)
        myList.stream().filter(f->f.getSoort()==Soort.ACTION).distinct().forEach(System.out::println);
    }
}

/*
Alle foto's uit XML-file:
00053 A  2,8 1/1000  200
00041 P  4,0 1/200   100
00026 A 11,0 1/500   400
00053 A  2,8 1/1000  200
00127 P  1,8 1/1000  100
00547 A  8,0 1/1000  200
00013 P  3,5 1/1000  200
00016 A  5,6 1/60   1600

Alle action foto's volgens nummer (zonder dubbels):
00016 A  5,6 1/60   1600
00026 A 11,0 1/500   400
00053 A  2,8 1/1000  200
00547 A  8,0 1/1000  200
 */
