package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Quan_ly_DV;

import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Student;

import java.util.ArrayList;
import java.util.List;

public class ManageSerViceILM implements ImanageService  {

    public static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"vinh" , 25 ,9.5f ));
        studentList.add(new Student(2,"son" , 22, 4.3f));
        studentList.add(new Student(3,"khuong",33,6.7f));
        studentList.add(new Student(4,"nam" , 30,6.7f));
    }

    @Override
    public List<Student> findAll() {

        return studentList;
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    public void deleteById(int id) {
    studentList.remove(id);
    }

    @Override
    public Student findById(int id) {
        return studentList.get(id);
    }

    @Override
    public Student sortStudentList() {
        return (Student) studentList;
    }

    @Override
    public void sum() {
    }

}
