package HomeWORK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

public class Predicat {
    public static void main(String[] args) {
        //«адача 2:
        //»спользу€ Predicate среди массива чисел вывести только те, которые €вл€ютс€
        //положительными.

        Double[] mas = {2.3, 2.4, -2.5, -1.0, 3.2, -4.0, 0.0};
        //ArrayList<Double> mas = new ArrayList<>(Arrays.asList(2.3, 2.4, -2.5, -1.0, 3.2, -4.0, 0.0));

        Predicate <Double> isposutuveNumber = x -> x > 0;
        Arrays.stream(mas).filter(isposutuveNumber)
                .forEach(value -> System.out.println(value));

    }
}
