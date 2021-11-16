package Abctract_Interface.TH1;

public class main {
    public static void main(String[] args) {
        Animal[] animals = new  Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.Makesound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());

                Furuit[] furuit = new Furuit[2];
                furuit[0] = new Orange();
                furuit[1] = new Apple();
                for (Furuit furui: furuit) {
                    System.out.println(furui.howToEat());
                }

            }
        }
    }
}
