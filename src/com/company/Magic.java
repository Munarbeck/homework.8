package com.company;

public class Magic extends Hero {
    public Magic(int health, int damage, String name) {
        super(health, damage, SuperAbility.BOOST, name);

    }

    public void applySuperPower (Boss boss, Hero[]heroes){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() +
                        RPG_Game.random.nextInt(5) + 1);
            }
        }
    }
}