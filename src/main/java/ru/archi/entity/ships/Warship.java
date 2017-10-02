package main.java.ru.archi.entity.ships;

import main.java.ru.archi.entity.Ship;

/**
 * Created by Черный on 27.09.2017.
 */
public class Warship extends Ship {
    private int rockets;

    public Warship(Integer speed) {
        super(speed);
    }

    public void setRockets(int rockets){
        this.rockets = rockets;
    }

    public int getRockets(){
        return rockets;
    }

    public void Shoot(){
        --rockets;
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void landing() {

    }

    @Override
    public void move() {

    }
}
