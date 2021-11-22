package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Main;

import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Contronler.Student_Contronler;
import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);
    Studenview studenview = new Studenview();
    Student_Contronler studentContronler = new Student_Contronler();
    public main() {
        List<Student> studentList = studentContronler.showlistStuden();
        Collections.sort(studentList);
        System.out.println("sau khi sort == "+studentList);
        while (true) {
            System.out.println("menu chọn");
            System.out.println("1 - hiển thị tất cả người");
            System.out.println("2 - thêm 1 người vào danh sách");
            System.out.println("3 - tìm vị trí 1 người trong danh sách");
            System.out.println("3 - tìm vị trí 1 người trong danh sách");
            System.out.println("4 - xóa 1 người trong dánh sách theo mã");
            System.out.println("5 - sửa thông tin 1 người theo mã");
            System.out.println("6 - sắp xếp danh sách theo điểm trung binh");
            System.out.println("7 - tính tổng điểm");
            System.out.println("8 - EXIT");
            System.out.println("-------------------------------------------");
            System.out.println("nhập số =>>>");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    studenview.showStudenlist();
                    break;
                case 2:
                    studenview.formCreateStudent();
                    break;
                case 3:
                    studenview.detailStudentById();
                    break;
                case 4:
                    studenview.deleteStudenById();
                    break;
                case 5:
                    studenview.editStudent();
                    break;
                case 6:

                    break;
                case 7:
                    break;
                case 8:
                    System.exit(choice);

            }

        }

    }
    public static void main(String[] args) {
        new main();
    }


    }

