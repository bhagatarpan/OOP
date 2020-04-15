package oop.concept.practice;

public class Zoo {
    public static void main (String  [] args){
        System.out.println("Start the APP at oop.concept.practice.Zoo Class ");
        Animal sparrow1 = new Sparrow();
//        sparrow1.move();

        Animal fish1 = new Fish();
//        fish1.move();
        animalMove(sparrow1);
        animalMove(fish1);
    }

    public static void animalMove(Animal animal){
        animal.move();
    }
}
