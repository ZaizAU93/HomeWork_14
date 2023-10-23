

import java.time.LocalDate;

import java.util.Locale;
import java.util.Scanner;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        //������ 1:
        //�������� ��������� ��� ������ �� ������� �������� ��� ������ �� ��������� ����.

        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� � ������� ����-��-��: ");
        String dateStr = scanner.nextLine();

     //   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateStr);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        String dayOfWeekStr = dayOfWeek.toString();

        System.out.println("���� ������: " + dayOfWeekStr);

        //������ 2:
        //�������� ��������� ��� ������ �� ����� ���� ���������� ��������
        // DateTimeFormatter formatter1 = new DateTimeFormatter.(-10-10);
        String tuesday = "2023-10-10";
        LocalDate date1 = LocalDate.parse(tuesday);
        date1 = date1.plusDays(7);
        System.out.println("���� ���������� ��������: " + date1);

        System.out.println("---------------------- 3 ������� ----------------------------");
        //������� ��������� IShape � ������� getSquare(int x, int y). ��������� ������-
        //���������, ����������� ��� ��� ��������(a*b) � ������������(0.5a*h)
        IShape square = (x, y) -> x * y;
        IShape triangle = (x, y) -> 0.5 * x * y;

        System.out.println("x * y: " + square.getSquare(5,4) + "0.5 * x * y" + triangle.getSquare(6,6));

        System.out.println("---------------------- 4 ������� ----------------------------");
        //��� ������ ������ ��������� ����������� ������, ��� �������, ���� � < b, �� �������
        //�. ���� a > b, �� ������� b. ����� ������� 0

       CCompar cCompar = (a, b, c) -> {
           c = 0;
           if (a < b){
               return a;
           }if (a > b){
               return b;
           }else {return c;}
       };

       System.out.println("������ ����� ���������: " + cCompar.comparison(6, 3, 5));

    }
}