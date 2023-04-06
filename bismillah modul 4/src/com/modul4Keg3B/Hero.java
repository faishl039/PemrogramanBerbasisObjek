package com.modul4Keg3B;

public abstract class Hero {
    public double healthPoint;
    public double attackDamage;
    public double defense;
    public double realDamage;
    public int level;
    public boolean lifeStatus;

    public void attack(Hero target){
        target.reviewDamage(attackDamage);
    }

    public void reviewDamage(double damage){
        realDamage = damage-defense;
        healthPoint -= realDamage;
        if (healthPoint <= 0){
            lifeStatus = false;
        }
    }

    public abstract void spawnIntro();

    public void checkStatus(){
        System.out.println("Level : " + this.level);
        System.out.println("Attack Damage : " + this.attackDamage + "\t Life Status : " + this.lifeStatus);
        System.out.println("Health point : " + this.healthPoint + "\t Defense : " + this.defense);
    }
}
