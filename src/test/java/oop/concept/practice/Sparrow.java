package oop.concept.practice;

public class Sparrow extends Bird implements Flyable {

    public Sparrow () {
        System.out.println("oop.concept.practice.Sparrow Constructor");
    }

    public  void fly(){
        System.out.printf("oop.concept.practice.Sparrow is flying");
    }

    public  void sing(){
        System.out.printf("oop.concept.practice.Sparrow sing chirping");
    }

    @Override
    public void move() {
        System.out.printf("oop.concept.practice.Sparrow is moving");
    }
}
