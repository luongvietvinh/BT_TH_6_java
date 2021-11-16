package Abctract_Interface.TH1;

public class Chicken extends Animal implements Edible{

    @Override
    public String Makesound() {
        return "chicken : cục cục cục cứt ứt";
    }

    @Override
    public String howToEat() {
        return "ăn loại nào hả bro";
    }
}
