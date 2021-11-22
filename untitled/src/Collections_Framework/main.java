package Collections_Framework;

import java.util.Scanner;

public class main {

    Scanner scanner = new Scanner(System.in);
    Controler_SanPham controlerSanPham = new Controler_SanPham();
    public main() {
        while (true) {
            System.out.println("menu chọn");
            System.out.println("1 - hiển thị tất cả người");
            System.out.println("2 - thêm 1 người vào danh sách");
            System.out.println("3 - tìm vị trí 1 người theo tên");
            System.out.println("4 - xóa 1 người trong dánh sách theo id");
            System.out.println("5 - sửa thông tin 1 người theo ID");
            System.out.println("6 - sắp xếp danh sách theo ID");
            System.out.println("8 - EXIT");
            System.out.println("-------------------------------------------");
            System.out.println("nhập số =>>>");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    controlerSanPham.showSanPham();

                    System.out.println("nhập phím Q  quay lại menu");
                    String enter = scanner.nextLine();
                    if (enter.equalsIgnoreCase("q")){
                        new main();
                    }

                case 2:
                    controlerSanPham.addSanPham();
                    break;
                case 3:
                    controlerSanPham.detailSanPhamByName();
                    break;
                case 4:
                    controlerSanPham.deleteSanPhamById();
                    break;
                case 5:
                    controlerSanPham.editSanPhamById();
                    break;
                case 6:
                    controlerSanPham.sortSanPhamById();
                    break;
                case 7:
                    System.exit(choice);
                    break;
            }

        }
    }
    public static void main(String[] args) {
        new main();
    }
}
