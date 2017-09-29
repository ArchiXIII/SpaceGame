package main.java.ru.archi.entity.people;

import main.java.ru.archi.entity.Professions;
import main.java.ru.archi.entity.Sentient;

/**
 * Created by Черный on 27.09.2017.
 */
public class Human implements Sentient {
    String name;
    Professions professions;

    public Human(String name, Professions professions){
        this.name = name;
        this.professions = professions;
    }

    @Override
    public void speak() {
        System.out.println("Hello, I am from earth");
    }

    @Override
    public void fight() {

    }

    @Override
    public void shoot() {

    }
}
