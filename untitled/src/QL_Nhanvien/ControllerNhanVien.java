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

    public static void showNhanVien(boolean isKySu) {
        if (isKySu) {
            for (NhanVien nv : listNV) {
                if (nv instanceof KySu)
                    System.out.println(nv.toString());
            }
        } else {
            for (NhanVien nv : listNV) {
                if (!(nv instanceof KySu))
                    System.out.println(nv.toString());
            }
        }
    }
    // tìm kiêm nhân viên
    public static NhanVien searchNhanVien(NhanVien[] listNV) {
        System.out.println("nhập tên nhân viên");
        String name = scanner.nextLine();
        for (int i = 0; i < ControllerNhanVien.listNV.length; i++) {
            if (ControllerNhanVien.listNV[i].getName().equals(name))
                return ControllerNhanVien.listNV[i];
        }


        return null;
    }

    // xóa nhân viên
    public static NhanVien[] deleteNhanvien() {
        System.out.println("nhập tên nhân viên cần xóa");
        String name = scanner.nextLine();
        int index = 0;
        NhanVien[] newnhanViens = new NhanVien[listNV.length - 1];
        for (int i = 0; i < listNV.length; i++) {
            if (listNV[i].getName().equals(name))
                index = i;
        }
        for (int i = 0; i < listNV.length - 1; i++) {
            if (i > index) {
                newnhanViens[i] = listNV[i];
            } else {
                newnhanViens[i] = listNV[i + 1];
            }
        }
        listNV = newnhanViens;
        return newnhanViens;
    }
    // sửa tên theo tên;

    public static NhanVien[] editNhanVien() {
        System.out.println("nhập tên muôn sửa");
        String name = scanner.nextLine();
        System.out.println("nhập tên mới");
        String newname = scanner.nextLine();
        System.out.println("nhập dịa chỉ mới");
        String newAddress = scanner.nextLine();
        System.out.println("nhập tuổi mới");
        int newage = scanner.nextInt();
        System.out.println("nhập workingDay");
        double newWorkingDay = Double.parseDouble(scanner.nextLine());
        System.out.println("nhập new Salary");
        double salary = Double.parseDouble(scanner.nextLine());
        for (int i = 0; i < listNV.length; i++) {
            if (listNV[i].getName().equals(name)) {
                listNV[i].setName(newname);
                listNV[i].setAddress(newAddress);
                listNV[i].setAge(newage);
                listNV[i].setWorkingDay(newWorkingDay);
                listNV[i].setSalary(salary);
            }
        }
        return listNV;
    }
    //sắp xếp nhân viên
    public static NhanVien[] sortByName() {
        NhanVien temp;
        for (int i = 0; i < listNV.length - 1; i++) {
            for (int j = i + 1; j < listNV.length; j++) {
                if ((listNV[i].getName()).charAt(0) > (listNV[j].getName()).charAt(0)) {
                    temp = listNV[i];
                    listNV[i] = listNV[j];
                    listNV[j] = temp;
                }
            }
        }
        return listNV;
    }
}
