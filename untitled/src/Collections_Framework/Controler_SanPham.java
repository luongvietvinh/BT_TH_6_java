package Collections_Framework;

import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Controler_SanPham<E> extends BT_1 {
    public static ArrayList<BT_1> arrayList = new ArrayList<>();

    static {
        arrayList.add(new BT_1("oto", 10000900, "japan"));
        arrayList.add(new BT_1("xe máy", 10000500, "japan"));
        arrayList.add(new BT_1("máy bay", 10006000, "japan"));
        arrayList.add(new BT_1("khuong", 200400, "taybannha"));
    }

    public Scanner scanner = new Scanner(System.in);

    public Controler_SanPham(String name, double price, String brand) {
        super(name, price, brand);

    }


    public Controler_SanPham() {

    }

    public void addSanPham() {
        while (true) {
            System.out.println("nhập name");
            String name = scanner.nextLine();
            System.out.println("nhập price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập brand");
            String brand = scanner.nextLine();

            arrayList.add(new BT_1(name, price, brand));

            System.out.println("nhập phím bất kỳ để tiếp tục- nhập Q để thoát");

            String q = scanner.nextLine();
            if (q.equalsIgnoreCase("q")) {
                new main();
            }
        }
    }

    public void editSanPhamById() {
        while (true) {
            System.out.println("nhập id muốn xoa");
            int id = Integer.parseInt(scanner.nextLine());
            arrayList.remove(id - 1);

            System.out.println("nhập name");
            String newname = scanner.nextLine();
            System.out.println("nhập price");
            double newprice = Double.parseDouble(scanner.nextLine());
            System.out.println("nhập brand");
            String newbrand = scanner.nextLine();


            arrayList.add(new BT_1(newname, newprice, newbrand));

            System.out.println("nhập phím bất kỳ để tiếp tục- nhập Q để thoát");
            String q = scanner.nextLine();
            if (q.equalsIgnoreCase("q")) {
                new main();
            }
        }
    }

    public void deleteSanPhamById() {
        while (true) {
            System.out.println("nhập id muốn xóa");
            int id = Integer.parseInt(scanner.nextLine());
            arrayList.remove(id - 1);

            System.out.println("nhập phím bất kỳ để tiếp tục- nhập Q để thoát");
            String q = scanner.nextLine();
            if (q.equalsIgnoreCase("q")) {
                new main();
            }
        }

    }

    public void showSanPham() {
        for (BT_1 list : arrayList) {
            System.out.println(list.toString());
        }

    }

    public void detailSanPhamByName() {
        while (true) {
            System.out.println("nhập tên cần tìm");
            String name = scanner.nextLine();

            for (int i = 0; i < arrayList.size(); i++) {
                if (name.equals(arrayList.get(i).getName())) {
                    System.out.println(arrayList.get(i).toString());

                    System.out.println("nhập phím bất kỳ để tiếp tục- nhập Q để thoát");

                    String q = scanner.nextLine();
                    if (q.equalsIgnoreCase("q")) {
                        new main();
                    }
                }
            }
        }
    }

    public void sortSanPhamById() {
        arrayList.sort(((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice())));

        Collections.sort(arrayList, (o1, o2) -> Double.compare(o2.getId(), o1.getId()));
        System.out.println(arrayList.toString());
        System.out.println("nhập phím bất kỳ để tiếp tục- nhập Q để thoát");

        String q = scanner.nextLine();
        if (q.equalsIgnoreCase("q")) {
            new main();
        }
    }


}
