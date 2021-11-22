package KE_Thua_6.Thuchanh;

public class TH_1_Cac_Doi_Tuong_Hinh_Hoc {
  public String color = "greey";
  public boolean filled = true;
  public TH_1_Cac_Doi_Tuong_Hinh_Hoc() {}

    public TH_1_Cac_Doi_Tuong_Hinh_Hoc(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "mau va vien la :{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
