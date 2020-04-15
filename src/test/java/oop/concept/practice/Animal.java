package oop.concept.practice;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import javax.xml.transform.stream.StreamSource;
import java.sql.SQLOutput;

public abstract class Animal {

String type;

    public Animal() {
        System.out.println("oop.concept.practice.Animal Constructor Class - No Type");
    }

    public Animal(String type) {
        System.out.println("oop.concept.practice.Animal Constructor Class - with String Type ");
        this.type = type;
    }

    public void sleep (){

        System.out.println("oop.concept.practice.Animal Class SLEEP, Type :" + type);

    }
    public abstract void move();
}
