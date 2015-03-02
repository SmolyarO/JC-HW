package com.ostap.units;
import java.util.Random;


public class Fly extends Walk{
    Random rnd = new Random();
    int rocket;

    public Fly() {
        speed += 30;
        damage += 10;
        rocket = 50;
    }

    // Setters

    public int attack(Base args) {
        int dmg;
        dmg = this.damage + (int) (rocket * (rnd.nextDouble()));
        args.hp = args.hp - dmg;
        getStatus();
        return args.hp;
    }

}
