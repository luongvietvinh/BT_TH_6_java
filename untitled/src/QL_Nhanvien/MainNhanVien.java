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
                    System.out.println("1. Kỹ sư");
                    System.out.println("2. Công nhân");
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
                    ControllerNhanVien.deleteNhanvien();
                    break;
                case 4:
                    ControllerNhanVien.editNhanVien();


                case 5:

                    System.out.println("1 công nhân");
                    System.out.println("2 kỹ sư");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            ControllerNhanVien.showNhanVien(true);
                            break;
                        case 2:
                            ControllerNhanVien.showNhanVien(false);
                    }
                case 6:
                        ControllerNhanVien.sortByName();
                case 7:
                    System.exit(0);
            }

        }
    }
}
