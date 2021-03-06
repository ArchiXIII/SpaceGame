package main.java.ru.archi.entity;

/**
 * Created by Черный on 27.09.2017.
 */
public abstract class Ship {
    private int hitPoint = 100;
    private boolean alive = true;
    private Integer speed;
    private Sentient pilot;

    public Ship(Integer speed){
        this.speed = speed;
    }

    public void setPilot(Sentient sentient){
        pilot = sentient;
    }

    public Sentient getPilot(){
        return pilot;
    }

    public abstract void takeoff();

    public abstract void landing();

    public abstract void move();

    public void damage(){
        hitPoint -= 10;
        if(hitPoint < 1) destruct();
    }

    private void destruct() {
        alive = false;
    }

    public boolean isLife(){
        return alive;
    }

    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    public Integer getSpeed(){
        return speed;
    }
}
