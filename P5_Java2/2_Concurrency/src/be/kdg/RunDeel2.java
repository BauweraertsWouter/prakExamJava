package be.kdg;

import be.kdg.concurrency.Persoon;
import be.kdg.concurrency.PersoonCallable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
/*
 * 2de zit examen Java2 - 18/08/2016
 */
public class RunDeel2 {
    private static List<Persoon> personen = Arrays.asList(
            new Persoon("Eric Buelens", Persoon.Geslacht.MAN, 1984, 2510.24),
            new Persoon("Patrick Devos", Persoon.Geslacht.MAN, 1967, 2140.21),
            new Persoon("Els Callens", Persoon.Geslacht.VROUW, 1974, 1478.91),
            new Persoon("Dorien Vanderpoorten", Persoon.Geslacht.VROUW, 1994, 1487.35),
            new Persoon("Fred Somers", Persoon.Geslacht.MAN, 1965, 3140.84),
            new Persoon("Floor Custers", Persoon.Geslacht.VROUW, 1989, 2541.92),
            new Persoon("Griet Op de Beeck", Persoon.Geslacht.VROUW, 1976, 2368.11),
            new Persoon("Lucas Van de Ven", Persoon.Geslacht.MAN, 1972, 3472.44)
    );

    public static void main(String[] args) throws Exception {
        // TODO: Aan te vullen - mannen (2.2)
        System.out.println("Mannen:");
        List<Persoon> mannen = personen.stream()
                .filter(p->p.getSekse()== Persoon.Geslacht.MAN)
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        mannen.stream().forEach(System.out::println);

        // TODO: Aan te vullen  - vrouwen (2.2).
        System.out.println("\nVrouwen:");
        List<Persoon> vrouwen = personen.stream()
                .filter(p->p.getSekse()== Persoon.Geslacht.VROUW)
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        vrouwen.stream().forEach(System.out::println);

        // TODO: Aan te vullen  (2.3)
        ExecutorService exec =  Executors.newSingleThreadExecutor();
        PersoonCallable mannenCal = new PersoonCallable(mannen);
        PersoonCallable vrouwenCal = new PersoonCallable(vrouwen);

        Future<Double> avgMan = exec.submit(mannenCal);
        Future<Double> avgVrouw = exec.submit(vrouwenCal);

        double resMan=0.0;
        double resVrouw=0.0;

        try{
            resMan = avgMan.get();
            resVrouw = avgVrouw.get();
        }catch (InterruptedException | ExecutionException e){
            //ignore
        }finally {
            exec.shutdown();
        }

        System.out.printf("\nGemiddeld loon mannen:\t€%6.2f\n", resMan);
        System.out.printf("Gemiddeld loon vrouwen:\t€%6.2f\n", resVrouw);


    }
}

/*
Mannen:
Fred Somers            MAN 1965 €3140,84
Patrick Devos          MAN 1967 €2140,21
Lucas Van de Ven       MAN 1972 €3472,44
Eric Buelens           MAN 1984 €2510,24

Vrouwen
Els Callens          VROUW 1974 €1478,91
Griet Op de Beeck    VROUW 1976 €2368,11
Floor Custers        VROUW 1989 €2541,92
Dorien Vanderpoorten VROUW 1994 €1487,35

Gemiddeld loon mannen:  €2815,93
Gemiddeld loon vrouwen: €1969,07
 */