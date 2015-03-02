package com.ostap.units;


public class Base {
    boolean alive = true;
    int speed;
    int hp;
    int damage;

    public Base() {
        speed = 10;
        hp = 250;
        damage = 45;
    }


    // Setters

    void setSpeed(int speed) {
        this.speed = speed;
    }

    public int attack(Base args) {
        args.hp = args.hp - this.damage;
        getStatus();
        return args.hp;
    }

    // Getters

    public int getSpeed() {
        return speed;
    }

    public boolean getStatus() {
        if (hp <= 0) {
            alive = false;
        }
        return alive;
    }


    // Output

    public void print(int param) {
        System.out.println(param);
    }

    public void print(boolean param) {
        System.out.println(param);
    }

    public void print(String param) {
        System.out.println(param);
    }

}
