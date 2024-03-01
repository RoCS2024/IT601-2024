package com.shooter.game.project;

public class Enemy {
    private int health;

    public Enemy() {
        health = 20;
    }

    public int getHP() {
        return health;
    }
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("Enemy killed!");
        } else {
            System.out.println("Enemy's health: " + health);
        }
    }
}
