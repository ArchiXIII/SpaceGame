package main.java.ru.archi.entity.ships;

import main.java.ru.archi.entity.Ship;

/**
 * Created by Черный on 29.09.2017.
 */
public class MerchantShip extends Ship {
    private int quantityOfCargo;

    public MerchantShip(Integer speed){
        super(speed);
    }

    public void setQuantityOfCargo(){

    }

    public Integer getQuantityOfCargo(){
        return quantityOfCargo;
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
