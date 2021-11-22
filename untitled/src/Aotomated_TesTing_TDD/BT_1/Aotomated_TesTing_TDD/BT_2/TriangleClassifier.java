package Aotomated_TesTing_TDD.BT_2;

public class TriangleClassifier {

    public static int kiemTraTamGiac(int a, int b, int c) {
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
            // Kiểm tra điều các tam giác đặc biệt
            if ((a == b) && (b == c)) {
                System.out.println("Tam giác đều!");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác cân!");
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("Tam giác vuông!");
            } else if (((a * a + b * b == c * c) && (a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giác thường!");
            }
        } else {
            System.out.println("3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!");
        }
        return kiemTraTamGiac(a,b,c);
    }


}