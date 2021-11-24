package com.company;

public class Warrior extends Hero {
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        System.out.println(getAbility());
        int cr = RPG_Game.random.nextInt(4)+ 2;
        this.setDamage(this.getDamage() * cr);
        System.out.println(getAbility() + "["+ cr+"]");
    }
}