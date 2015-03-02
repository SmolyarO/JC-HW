package com.ostap.runner;

import com.ostap.units.Base;
import com.ostap.units.Fly;
import com.ostap.units.Swim;
import com.ostap.units.Walk;

/**
 * Created by Spartacus on 23.02.2015.
 */
public class Main {
    public static void main (String [] args) {
        Base baseUnit = new Base();
        Base walkUnit = new Walk();
        Base flyUnit = new Fly();
        Base swimUnit = new Swim();

        baseUnit.print(baseUnit.getSpeed());
        walkUnit.print(walkUnit.getSpeed());

        baseUnit.print(baseUnit.attack(walkUnit));
        walkUnit.print(walkUnit.attack(baseUnit));

        baseUnit.print(baseUnit.getStatus());
        walkUnit.print(walkUnit.getStatus());

        baseUnit.print(baseUnit.attack(walkUnit));
        walkUnit.print(walkUnit.attack(baseUnit));

        baseUnit.print(baseUnit.getStatus());
        walkUnit.print(walkUnit.getStatus());


        walkUnit.print(walkUnit.attack(flyUnit));
        flyUnit.print(flyUnit.attack(walkUnit));

        walkUnit.print(walkUnit.getStatus());
        flyUnit.print(flyUnit.getStatus());


        swimUnit.print(swimUnit.attack(flyUnit));
        swimUnit.print(swimUnit.getStatus());
        swimUnit.getSpeed();
        ((Swim) swimUnit).swim();
        Swim a = (Swim) swimUnit;
        a.swim();


    }
}
