package QL_Nhanvien;

public class CongNhan extends NhanVien {

    public CongNhan(int id, String name, int age, String address, double workingDay, double salary) {
        super(id, name, age, address, workingDay, salary);
    }

    @Override
    public double getSumSalary() {
        return 0;
    }
}
