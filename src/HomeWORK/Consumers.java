package HomeWORK;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class Consumers {
    public static  void  main(String ars[]) {
        //��������� Consumer ����������� ������, ������� ����� ��������� � ���� ������ �
    //������� �*�����* BYN�(����� ������, ������ *�����* �������� ����� ��������), �
    //�������� �����, ������������ ����� � �������

    Scanner scanner = new Scanner(System.in);
    System.out.println("������� ����������� ����������� ������");
    String line = scanner.nextLine() + " BYN";

        Consumer <String> output = x -> {
        String[] masDollSplit = x.split(" ");
         System.out.println(line +" = "+ Double.parseDouble(masDollSplit[0])/3.28+" USD");
        };

    }
}
