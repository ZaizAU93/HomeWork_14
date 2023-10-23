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
    Function<String, Double> dollars_convert = x -> {
        String[] masDollSplit = x.split(" ");
        return Double.parseDouble(masDollSplit[0]);
    };

    Consumer<String> output = x -> System.out.println(line +" = "+dollars_convert.apply(line)/3.28+" USD");
    output.accept(line);

    }
}
