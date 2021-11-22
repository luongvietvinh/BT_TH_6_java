package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Contronler;

import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Human;
import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Student;
import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Quan_ly_DV.ManageSerViceILM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student_Contronler {
    ManageSerViceILM manageSerViceILM = new ManageSerViceILM();
    //hiển thị list student
    public List<Student> showlistStuden(){
        return manageSerViceILM.findAll();
    }
    // tạo thêm học viên lớp Studen
    public void createStuden(Student student){
        manageSerViceILM.save(student);
    }
    //xóa theo id lớp Studen
    public void deleteStudent(int id) {
        manageSerViceILM.deleteById(id);
    }
    // thông tin lớp Student theo id
    public Student detailStudent(int id){
        return manageSerViceILM.findById(id);
    }
    // sửa thông tin lớp Student theo id
    public void editStuden(int id, Student student){
        Student student1 = manageSerViceILM.findById(id);
        student1.setName(student.getName());
        student1.setAge(student.getAge());
        student1.setAvg(student.getAvg());
        manageSerViceILM.deleteById(id);
        manageSerViceILM.save(student1);
    }
    public void sortStudentAVG(){

    }

}
