package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Quan_ly_DV;

import DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien.Student;

import java.util.List;

public interface ImanageService {
    List<Student> findAll();
    void save(Student student);
    void deleteById(int id);
    Student findById(int id);
    Student sortStudentList();
    void sum();

}
