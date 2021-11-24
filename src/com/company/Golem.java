package com.company;

public class Golem extends Hero {
    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.SAVE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            int partDamage = boss.getDamage() / 5;
            int aliveHeroes = 0;
            if (heroes[i].getHealth() > 0)
                if (heroes[i] != this){
                    this.setHealth(getHealth() - partDamage);
                }
        }
    }
}