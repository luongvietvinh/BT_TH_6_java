package KE_THUA_6.BT_1;

public class main_BT_1 {
    public static void main(String[] args) {

        BT_1_Cricle_va_Cylinder s1 = new BT_1_Cricle_va_Cylinder();
        s1.setRadius(3.5);
        s1.setColor("pink");
        System.out.println("diện tích là: " + s1.getDienTich());
        Cylinder_BT_1_1 ahihi = new Cylinder_BT_1_1(4.5);

        System.out.println("thể tích là : " + ahihi.getTheTich() + s1.toString());

    }
}
