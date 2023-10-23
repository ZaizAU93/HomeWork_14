package HomeWORK;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.time.*;

public class Hundred {
    public static void main(String[] args) {
        //Задача 1:
        //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        //когда пользователю исполнится 100 лет. Использовать Date/Time API.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату рождения в формате ГГГГ-ММ-ДД: ");
        String dateStr = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD");
        LocalDate date = LocalDate.parse(dateStr);
        LocalDate dateHundred = date.plus(Period.ofYears(100));
        System.out.println("Сто лет вам исполнится :" + dateHundred.toString());



    }
}
