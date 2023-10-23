package HomeWORK;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Consumers {
    public static  void  main(String ars[]) {
        //»спользу€ Consumer реализовать л€мбду, котора€ будет принимать в себ€ строку в
    //формате У*сумма* BYNФ(через пробел, вместо *сумма* вставить любое значение), а
    //выводить сумму, переведенную сразу в доллары

    Scanner scanner = new Scanner(System.in);
    System.out.println("¬еедите колличестве белорусских рублей");
    String line = scanner.nextLine() + " BYN";
    Function<String, Double> dollars_convert = x -> {
        String[] masDollSplit = x.split(" ");
        return Double.parseDouble(masDollSplit[0]);
    };

    Consumer<String> output = x -> System.out.println(line +" = "+dollars_convert.apply(line)/3.28+" USD");
    output.accept(line);

    }
}
