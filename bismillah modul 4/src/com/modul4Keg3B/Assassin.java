package com.modul4Keg3B;

public class Assassin extends Hero implements CriticalDamage{

    public Assassin(int level){
        this.level = level;
        this.healthPoint = (level*90)+3000;
        this.defense = (level*15)+300;
        this.attackDamage = (level*30*bonusDamage)+800;
        this.lifeStatus = true;
    }

    @Override
    public void spawnIntro() {
        System.out.println("Dont fight me or you will die!");
    }

}
