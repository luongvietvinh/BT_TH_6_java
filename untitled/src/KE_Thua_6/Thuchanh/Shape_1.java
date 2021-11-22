package KE_Thua_6.Thuchanh;

public class Shape_1 {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape_1(String color) {
        this.color = color;
    }

    public Shape_1() {
    }
    @Override
    public String toString(){
        return "Mau sac la"+color;
    }
}
