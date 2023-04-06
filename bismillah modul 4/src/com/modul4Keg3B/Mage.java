package com.modul4Keg3B;

public class Mage extends Hero implements MagicalDamage{

    public Mage(int level){
        this.level = level;
        this.healthPoint = (level*85)+2500;
        this.defense = (level*10)+200;
        this.attackDamage = (level*35*MagicDamageBonus)+700;
    }

    @Override
    public void spawnIntro() {
        System.out.println("Nobody can beat me!");
    }

}
