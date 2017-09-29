package main.java.ru.archi.controller;

import main.java.ru.archi.entity.Professions;
import main.java.ru.archi.entity.people.Human;
import main.java.ru.archi.entity.ships.Warship;

/**
 * Created by Черный on 29.09.2017.
 */
public class Controller {
    public static void main(String[] args) {
        Human humansPilot = new Human("Jack", Professions.PILOT);

        Warship warship = new Warship(500);

        warship.setRockets(10);

        warship.setPilot(humansPilot);

        warship.takeoff();
    }
}
