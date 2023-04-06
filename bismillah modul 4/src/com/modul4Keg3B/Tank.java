package com.modul4Keg3B;

public class Tank extends Hero{

    public Tank(int level){
        this.level = level;
        this.healthPoint = (level*200)+7000;
        this.defense = (level*15)+500;
        this.attackDamage = (level*20)+500;
        this.lifeStatus = true;
    }

    @Override
    public void spawnIntro() {
        System.out.println("Kill me if u can!");
    }

}
