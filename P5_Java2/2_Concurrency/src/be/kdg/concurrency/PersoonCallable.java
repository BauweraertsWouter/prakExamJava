package be.kdg.concurrency;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.concurrent.Callable;

/*
 * 2de zit examen Java2 - 18/08/2016
 */
public class PersoonCallable implements Callable<Double>{
    private List<Persoon> personen;

    public PersoonCallable(List<Persoon> personen) {
        this.personen = personen;
    }

    @Override
    public Double call() throws Exception {
        OptionalDouble gemiddelde =  personen.stream().mapToDouble(Persoon::getLoon).average();

        if (gemiddelde.isPresent()){
            return gemiddelde.getAsDouble();
        }else {
            return null;
        }
    }

    // TODO aanvullen (2.1)

}
