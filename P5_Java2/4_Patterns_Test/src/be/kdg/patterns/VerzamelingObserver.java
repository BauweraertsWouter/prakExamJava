package be.kdg.patterns;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Wouter on 10/01/2017.
 */
public class VerzamelingObserver implements Observer{
    private ObservableVerzameling verzameling;

    public VerzamelingObserver(){
        verzameling = new ObservableVerzameling();
    }

    @Override
    public void update(Observable o, Object arg) {
        verzameling.print();
    }
}
