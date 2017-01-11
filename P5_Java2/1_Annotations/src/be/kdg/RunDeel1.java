package be.kdg;

import be.kdg.annotations.Programmer;
import be.kdg.annotations.Refactored;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.sql.Ref;
import java.util.Map;
import java.util.TreeMap;

/**
 * 2de zit examen Java2 - 18/08/2016
 * NAAM:
 * GROEP:
 */

public class RunDeel1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        // TODO vanaf hier aanvullen (1.2)
        for(Method m : Programmer.class.getDeclaredMethods()){
            for (Annotation a : m.getDeclaredAnnotations()){
                if (a instanceof Refactored){
                    if (map.containsKey(((Refactored)a).value())){
                        map.replace(((Refactored)a).value(), ((Refactored)a).count()+map.get(((Refactored)a).value()));
                    }else {
                        map.put(((Refactored)a).value(), ((Refactored)a).count());
                    }
                }
            }
        }

        System.out.println("Refactorings in klasse " + Programmer.class.getName() + ":");
        System.out.println(map);
    }
}

/*
Refactorings in klasse be.kdg.annotations.Programmer:
{Erik=3, Jos=5, Staf=2}
 */
