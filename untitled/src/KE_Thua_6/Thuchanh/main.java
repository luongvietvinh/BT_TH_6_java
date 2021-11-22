package KE_Thua_6.Thuchanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai canh thu nhat ");
        double side1 = scanner.nextDouble();
        System.out.println("Chieu dai canh thu hai ");
        double side2 = scanner.nextDouble();
        System.out.println("Chieu dai canh thu ba ");
        double side3 = scanner.nextDouble();
        System.out.println("Mau sac tam giac");
        String color = scanner.next();
        Triangle triangle = new Triangle(color,side1,side2,side3);
        System.out.println(triangle.toString());
    }
}
