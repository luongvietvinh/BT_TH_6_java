package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien;

import java.util.Comparator;

public class Student extends Human implements Comparable {

    private float avg;

    public Student(float avg) {
        this.avg = avg;
    }

    public Student() {
    }

    public Student(int id, String name, int age, float avg) {
        super(id , name , age);
        this.avg = avg;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public double getAverageScore() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
         float compareAVG = ((Student) o).getAvg();
        return (int) (this.avg - compareAVG);
    }

    @Override
    public String toString() {
        return "Student{" +
                "avg=" + avg +
                '}';
    }
}
