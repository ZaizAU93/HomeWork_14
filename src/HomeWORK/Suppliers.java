package HomeWORK;

import java.util.Scanner;
import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите строку ");
        StringBuilder line = new StringBuilder(scanner.nextLine());

        Supplier<StringBuilder> stroka = () -> {
            return line.reverse();
        };

        System.out.println(stroka.get());
    }
}
