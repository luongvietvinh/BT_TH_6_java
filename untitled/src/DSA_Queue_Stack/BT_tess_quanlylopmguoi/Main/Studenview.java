package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Main;

import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Contronler.Student_Contronler;
import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studenview {
    Scanner scanner = new Scanner(System.in);
    Student_Contronler studentContronler = new Student_Contronler();

    //nhập vào thông tin học viên cần thêm
    public void formCreateStudent() {
        while (true) {
            System.out.println("nhập vào id của học viên");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập tên của học viên");
            String name = scanner.nextLine();
            System.out.println("nhập vào tuổi của học viên");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("nhập vào điểm trung bình của học viên");
            float avg = Float.parseFloat(scanner.nextLine());
            Student student = new Student(id, name, age, avg);
            studentContronler.createStuden(student);
            System.out.println("nhập phím bất kỳ để tạo học viên - nhập vinhdeptrai để quay lại menu");
            String enterQuit = scanner.nextLine();
            if (enterQuit.equalsIgnoreCase("vinhdeptrai")){
                new main();
            }

        }
    }
    // hiển thị thông tin của học viên
    public void showStudenlist() {
        System.out.println("STT  name   age   avg");

        System.out.println("size == " + studentContronler.showlistStuden().size());
        for (int i = 0; i < studentContronler.showlistStuden().size(); i++) {
            System.out.println(studentContronler.showlistStuden().get(i).getId() + "  "
            + studentContronler.showlistStuden().get(i).getName()+ "  " + studentContronler.showlistStuden().get(i).getAge()
            + "  " + studentContronler.showlistStuden().get(i).getAvg());
        }
        System.out.println("nhap phim bat ky de tiep tuc, nhập q để quay lại menu");
        String enterQuit = scanner.nextLine();
        if (enterQuit.equalsIgnoreCase("q")){
            new main();
        }
    }
    // xóa lớp studen bằnd id
    public void deleteStudenById() {

            System.out.println("nhập vào số id muôn xóa");
            int id = scanner.nextInt();
            studentContronler.deleteStudent(id -1);
            System.out.println("đã xóa thành công");
            System.out.println("nhập phím bất kỳ để xóa tiêp -- nhấn q để quay lại menu");
            String enterQuit = scanner.nextLine();
            if (enterQuit.equalsIgnoreCase("q")){
                new main();
            
        }
    }
    // hiển thị học viên theo id
    public void detailStudentById() {
        while (true) {
            System.out.println("nhập id  hiển thị");
            int id =Integer.parseInt(scanner.nextLine());

            Student student = studentContronler.detailStudent(id - 1);
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge() + " " + student.getAvg());
            System.out.println("--- nhập  q để quay lại menu");
            String quit = scanner.nextLine();
            if (quit.equalsIgnoreCase("q")) {
                new main();
            }
        }
    }
    public void editStudent(){
        while (true){
        System.out.println("nhập vào id muốn sửa");
        int id =Integer.parseInt(scanner.nextLine());
        System.out.println("nhâp tên học viên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi học viên");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập điểm tb học viên");
        float avg = Float.parseFloat(scanner.nextLine());

        Student student = new Student(id , name , age , avg);
        studentContronler.editStuden(id -1 , student);
        System.out.println("sửa thành công");

        System.out.println("nhập phím bất kỳ để sửa tiếp, q  để quay lại menu");
        String quit = scanner.nextLine();
        if (quit.equalsIgnoreCase("q")){
              new main();
        }}
    }
    public void sortAvgStudent(List<Student> studentList){
        List<Student> students = new ArrayList<>();


//        students.sort((o1, o2) -> Double.compare(o2.getAverageScore() , o1.getAverageScore()));
//        studentList.addAll(students);
        students.forEach(e -> System.out.println(e));
        }


}


