

import java.time.LocalDate;

import java.util.Locale;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        //Задача 1:
        //Написать программу для вывода на консоль названия дня недели по введенной дате.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате ГГГГ-ММ-ДД: ");
        String dateStr = scanner.nextLine();

     //   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfWeekStr = dayOfWeek.toString();

        System.out.println("День недели: " + dayOfWeekStr);

        //Задача 2:
        //Написать программу для вывода на экран дату следующего вторника
        // DateTimeFormatter formatter1 = new DateTimeFormatter.(-10-10);
        String tuesday = "2023-10-10";
        LocalDate date1 = LocalDate.parse(tuesday);
        date1 = date1.plusDays(7);
        System.out.println("Дата следующего вторника: " + date1);

        System.out.println("---------------------- 3 задание ----------------------------");
        //Создать интерфейс IShape с методом getSquare(int x, int y). Используя лямбда-
        //выражения, реализовать его для квадрата(a*b) и треугольника(0.5a*h)
        IShape square = (x, y) -> x * y;
        IShape triangle = (x, y) -> 0.5 * x * y;

        System.out.println("x * y: " + square.getSquare(5,4) + "0.5 * x * y" + triangle.getSquare(6,6));

        System.out.println("---------------------- 4 задание ----------------------------");
        //При помощи лямбда выражения реализовать логику, при которой, если а < b, то вернуть
        //а. Если a > b, то вернуть b. Иначе вернуть 0

       CCompar cCompar = (a, b, c) -> {
           c = 0;
           if (a < b){
               return a;
           }if (a > b){
               return b;
           }else {return c;}
       };

       System.out.println("Логика лямда выражения: " + cCompar.comparison(6, 3, 5));

    }
}