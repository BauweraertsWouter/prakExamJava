package be.kdg.data;

import be.kdg.model.Foto;
import be.kdg.model.Soort;

import java.util.ArrayList;
import java.util.List;

/**
 * 2de zit examen Java2 - 18/08/2016
 * HIER MAG JE NIETS WIJZIGEN
 */
public class Data {
    static List<Foto> list = new ArrayList<>();

    public static List<Foto> getList() {
        list.add(new Foto(53, Soort.ACTION, 2.8, "1/1000", 200));
        list.add(new Foto(41, Soort.PORTRAIT, 4.0, "1/200", 100));
        list.add(new Foto(26, Soort.ACTION, 11.0, "1/500", 400));
        list.add(new Foto(53, Soort.ACTION, 2.8, "1/1000", 200));
        list.add(new Foto(127, Soort.PORTRAIT, 1.8, "1/1000", 100));
        list.add(new Foto(547, Soort.ACTION, 8.0, "1/1000", 200));
        list.add(new Foto(13, Soort.PORTRAIT, 3.5, "1/1000", 200));
        list.add(new Foto(16, Soort.ACTION, 5.6, "1/60", 1600));

        return list;
    }
}
