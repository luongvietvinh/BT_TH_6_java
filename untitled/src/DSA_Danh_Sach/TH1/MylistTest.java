package DSA_Danh_Sach.TH1;

import DSA_Danh_Sach.TH1.Mylist;

public class MylistTest {
    public static void main(String[] args) {
        Mylist<Integer> listinteger = new Mylist<Integer>();
        listinteger.add(1);
        listinteger.add(2);
        listinteger.add(3);
        listinteger.add(3);
        listinteger.add(4);
        listinteger.add(1000);
        System.out.println("element 4 : " + listinteger.get(4));
        System.out.println("element 1 : " + listinteger.get(1));
        System.out.println("element 3: " + listinteger.get(4));

        listinteger.get(6);
        System.out.println("element: " + listinteger.get(5));

    }
}
