package main.java.ru.archi.entity;

/**
 * Created by Черный on 27.09.2017.
 */
public abstract class Ship {
    int hitPoint = 100;
    boolean isLife = true;
    Integer speed;
    Sentient pilot;

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
        if(hitPoint < 1) destruction();
    }

    private void destruction() {
        isLife = false;
    }

    public boolean IsLife(){
        return isLife;
    }

    public void setSpeed(Integer speed){
        this.speed = speed;
    }

    public Integer getSpeed(){
        return speed;
    }
}
