package KE_Thua_6.Thuchanh;

public class Circle extends TH_1_Cac_Doi_Tuong_Hinh_Hoc {

    private double darius = 1.0;

    public Circle() {};

    public Circle(double darius) {
        this.darius = darius;
    }

    public Circle(String color, boolean filled, double darius) {
        super(color, filled);
        this.darius = darius;
    }

    public double getDarius() {
        return darius;
    }

    public void setDarius(double darius) {
        this.darius = darius;
    }

        public double getArea () {
        return darius *darius * Math.PI;
        }
        public double getPerimeter(){
        return 2 * darius * Math.PI;
        }

    @Override
    public String toString() {
        return "Circle whit darius :" +getDarius() +
                "  va chi so cua lop cha la:" +
                super.toString();

    }
}

