package HomeWORK;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.time.*;

public class Hundred {
    public static void main(String[] args) {
        //������ 1:
        //������������ ������ � ������� ���� ������ ��������. ��������� ������ ������� ����,
        //����� ������������ ���������� 100 ���. ������������ Date/Time API.
        Scanner scanner = new Scanner(System.in);
        System.out.print("������� ���� �������� � ������� ����-��-��: ");
        String dateStr = scanner.nextLine();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-DD");
        LocalDate date = LocalDate.parse(dateStr);
        LocalDate dateHundred = date.plus(Period.ofYears(100));
        System.out.println("��� ��� ��� ���������� :" + dateHundred.toString());



    }
}
