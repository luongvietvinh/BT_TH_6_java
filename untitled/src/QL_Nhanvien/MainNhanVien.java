package QL_Nhanvien;

import java.util.Scanner;

public class MainNhanVien {
    private static Object CongNhan;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Quản lý nhân viên");
            System.out.println("1.Thêm nhân viên");
            System.out.println("2.Tìm kiếm nhân viên");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Sửa nhân viên");
            System.out.println("5.Hiển thị nhân viên");
            System.out.println("6.Sắp xếp nhân viên");
            System.out.println("7.Exit");
            System.out.println("mời nhập sốsố");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            NhanVien congNhan = ControllerNhanVien.createNhanVien(false);
                            ControllerNhanVien.addNhanVien(congNhan);
                            break;
                        case 2:
                            NhanVien kySu = ControllerNhanVien.createNhanVien(true);
                            ControllerNhanVien.addNhanVien(kySu);
                            break;

                    }
                    break;
                case 2:
                        ControllerNhanVien.searchNhanVien(ControllerNhanVien.listNV);
                        break;
                case 3:
                    ControllerNhanVien.deleteNhanVien(ControllerNhanVien.listNV);
                    break;


                case 5:

                    System.out.println("1 công nhân");
                    System.out.println("2 kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                           ControllerNhanVien.showNhanVien(1);
                           break;

                        case 2:
                           ControllerNhanVien.showNhanVien(2);
                            break;
                    }
                    break;
            }

        }
    }
}
