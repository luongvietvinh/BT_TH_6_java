package DSA_Danh_Sach;

import Abctract_Interface.TH1.Animal;

import java.util.ArrayList;

public class Demo_Set {

    public static void main(String[] args) {
        // khai báo một mảng ArrayList languages
        ArrayList<String> languages = new ArrayList<>();
        // sử dụng phương thức add() để thêm phần tử vào mảng languages
        languages.add("Python");
        languages.add("English");
        languages.add("JavaScript");
        System.out.println("Các phần tử trong mảng languages: " + languages);

        // thay thế phần tử tại vị trí 1 bằng phần tử "java" rồi gán phần tử bi thay thế vào biến element
        String element = languages.set(1, "Java");
        System.out.println("Mảng sau khi thay thế: " + languages);
        System.out.println("Phần tử bị thay thế: " + element);

        System.out.println("---------------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
}
