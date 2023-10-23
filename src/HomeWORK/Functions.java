package HomeWORK;
import java.util.Scanner;
import java.util.function.Function;

public class Functions {
    public static void main(String[] args) {
        //��������� Function ����������� ������, ������� ����� ��������� � ���� ������ �
        //������� �*�����* BYN�(����� ������, ������ *�����* �������� ����� ��������), �
        //���������� �����, ������������ ����� � �������.
        Scanner scanner = new Scanner(System.in);
        System.out.println("������� ����������� ����������� ������");
        String line = scanner.nextLine() + " BYN";
        Function<String, Double> dollars_convert = x -> {
            String[] masDollSplit = x.split(" ");
            return Double.parseDouble(masDollSplit[0]);
        };

        System.out.println(line + " = " + dollars_convert.apply(line)/3.28 + " USD");

    }
}
