package com.ostap.units;


public class Swim extends Base {
    int torpedo;
    public Swim() {
        speed += 20;
        damage += 15;
        torpedo = 60;
        hp += 20;
    }

    // Setters

    public void swim() {
        print(speed);
        print("This is an exclusive swimming method");
    }

    /*@Override
    public int getSpeed() {
        print("Must be 30");
        return super.getSpeed();
    }*/
}
