package com.modul4Keg3B;

public class Driver {
    public static void main(String[] args) {
        Assassin player1 = new Assassin(1);
        Tank player2 = new Tank(1);
        int round = 1;

        //nampilkan status player sebelum fight
        System.out.println("===== Player 1 =====");
        player1.checkStatus();
        System.out.println("\n===== Player 2 =====");
        player2.checkStatus();

        while (player1.lifeStatus && player2.lifeStatus ){
            System.out.println("\n===== FIGHT BEGIN =====");
            System.out.println("===== ROUND " + round + " =====");
            System.out.println("===== Player 1 Turn =====");
            player1.spawnIntro();
            //player 1 bisa kill kalo masih hidup/bolean true
            if (player1.lifeStatus){
                player1.attack(player2);
                System.out.println("Player 2 HP Remaining : " +player2.healthPoint);
            }

            System.out.println("===== Player 2 Turn =====");
            player2.spawnIntro();
            if (player2.lifeStatus){
                player2.attack(player1);
                System.out.println("Player 1 HP Remaining : " +player1.healthPoint);
            }

            round++;
        }

        //print pemenang
        if (player1.lifeStatus){
            System.out.println("\nPLAYER 1 WIN");
        }
        else {
            System.out.println("\nPLAYER 2 WIN");
        }
    }

}