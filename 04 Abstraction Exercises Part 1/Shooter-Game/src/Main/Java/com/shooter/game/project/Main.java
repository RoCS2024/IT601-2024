package com.shooter.game.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Shooter Game!");
        System.out.println("Your initial stats: HP - " + player.getHP() + ", AP - " + player.getAP() + ", Level - " + player.getLevel() + ", Experience - " + player.getExperience());
        Enemy enemy = new Enemy();
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Attack the enemy");
            System.out.println("2. Quit");
            if(enemy.getHP() < 1){
                enemy = new Enemy();
            }
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You encountered an enemy with " + enemy.getHP() + " health.");
                    if(enemy.getHP() > 0) {
                        player.Attack(enemy);
                        player.takeDamage(10);
                        System.out.println("You've been attacked! Your current health is " + player.getHP() + " health.");
                    }
                    if (enemy.getHP() < 1) {
                    player.experienceGain();
                    if(player.getExperience() < 100){
                        System.out.println("You've gained experience points! " + player.getExperience() + " points");
                    }
                    boolean food = Math.random() < 0.80;
                    if(food){
                        System.out.println("You've acquired food!");
                        player.acquireFood();
                        System.out.println("Your current health is " + player.getHP() + " health.");
                    }
                }
                    break;
                case 2:
                    System.out.println("Exiting game...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
