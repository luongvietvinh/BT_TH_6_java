package QL_Nhanvien;

import java.util.Scanner;

public class ControllerNhanVien {
    static NhanVien[] listNV = new NhanVien[0];
    static Scanner scanner = new Scanner(System.in);

    public static NhanVien createNhanVien(boolean isKySu) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập address");
        String address = scanner.nextLine();
        System.out.println("Nhập age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập workingDay");
        double workingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập salary");
        double salary = Double.parseDouble(scanner.nextLine());

        if (!isKySu) {
            CongNhan congNhan = new CongNhan(id, name, age, address, workingDay, salary);
            return congNhan;
        } else {
            System.out.println("Nhập payRateSalary");
            double payRateSalary = Double.parseDouble(scanner.nextLine());
            KySu kySu = new KySu(id, name, age, address, workingDay, salary, payRateSalary);
            return kySu;
        }
    }

    public static void addNhanVien(NhanVien nhanVien) {
        NhanVien[] newArrNV = new NhanVien[listNV.length + 1];
        for (int i = 0; i < listNV.length; i++) {
            newArrNV[i] = listNV[i];
        }
        newArrNV[listNV.length] = nhanVien;

        listNV = newArrNV;
    }

    public static void showNhanVien(int choice) {
        if (choice == 1)

            for (NhanVien nv : listNV) {
                if (nv instanceof CongNhan) {
                    System.out.println(nv.toString());
                } else if (choice == 2) {
                    for (NhanVien nv2 : listNV) {
                        if (nv2 instanceof KySu)
                            System.out.println(nv2.toString());

                    }
                }
            }

    }

    public static void searchNhanVien(NhanVien[] listNV) {
        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < listNV.length; i++) {
            if (name.equals(listNV[i].getName())) {
                System.out.println(listNV[i]);
                check = true;
                break;
            } else {
                check = false;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy tên nhân viên");
        }
    }

    public static NhanVien[] deleteNhanVien(NhanVien[] listNV) {
        System.out.println("nhập tên nhân viên muốn xóa");
        int id = scanner.nextInt();
        int index = 0;

        for (int i = 0; i < listNV.length; i++) {
            if (id == listNV.length) ;
            index = i;
            break;
        }
    NhanVien[] newnhanvien = new NhanVien[listNV.length -1];
        for (int i = index; i < listNV.length -1; i++) {
            listNV[i] = listNV[i + 1];
        }
        for (NhanVien x: newnhanvien
             ) {
            System.out.println(x.toString());
        }
        return newnhanvien;
    }
    public static void showAllNv() {
        for (NhanVien nv: listNV ) {
            System.out.println(nv);
        }
    }


}
