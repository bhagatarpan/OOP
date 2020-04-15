package oop.concept.practice;

public class Encapsulation {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("John Doe");
        s.setAge(33);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
