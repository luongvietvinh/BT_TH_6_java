package DSA_Queue_Stack.BT_tess_quanlylopmguoi.Nguoi_Hocvien;

import java.util.ArrayList;

public class Human {
    private int id;
    private String name;
    private int age;

    public Human() {
    }

    public Human(int id,String name , int age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
