package HomeWORK;
import java.util.Scanner;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        //»спользу€ Function реализовать л€мбду, котора€ будет принимать в себ€ строку в
        //формате У*сумма* BYNФ(через пробел, вместо *сумма* вставить любое значение), а
        //возвращать сумму, переведенную сразу в доллары.
        Scanner scanner = new Scanner(System.in);
        System.out.println("¬еедите колличестве белорусских рублей");
        String line = scanner.nextLine() + " BYN";
        Function<String, Double> dollars_convert = x -> {
            String[] masDollSplit = x.split(" ");
            return Double.parseDouble(masDollSplit[0]);
        };

        System.out.println(line + " = " + dollars_convert.apply(line)/3.28 + " USD");

    }
}
