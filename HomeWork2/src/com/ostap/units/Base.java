package com.ostap.units;

/**
 * Created by Spartacus on 24.02.2015.
 */
public class Base {
    int speed = 10;
    public Base(int speed) {
        setSpeed(speed);
        getSpeed();
    }

    private void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        System.out.println(speed);
        return speed;
    }
}
