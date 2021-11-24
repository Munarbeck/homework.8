package com.company;

import java.util.Random;

public class Thor extends Hero {

    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.HIT, name);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            Random random = new Random();
            int thor = random.nextInt(2);
            if (heroes[i].getHealth() > 0) {
                if (thor == 1) {
                    System.out.println("Thor is hit");
                    boss.setDamage(0);
                    break;
                } else if (thor == 2) {
                    System.out.println("Thor is don't hit ");
                    boss.setDamage(boss.getDamage());
                    break;
                }
            }
        }
    }
}