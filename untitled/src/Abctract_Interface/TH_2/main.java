package Abctract_Interface.TH_2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "pink", true);

        System.out.println("trước khi sắp xếp");

        for (ComparableCircle circl : circles) {
            System.out.println(circl);
        }
        Arrays.sort(circles);
        System.out.println("sau khi sắp xếp");
        for (ComparableCircle circl : circles) {
            System.out.println(circl);
        }
    }
}
