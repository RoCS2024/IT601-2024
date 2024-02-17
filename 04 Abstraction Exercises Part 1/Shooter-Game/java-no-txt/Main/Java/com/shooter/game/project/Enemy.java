package com.shooter.game.project;

public class Enemy {
    private int HP;

    public Enemy() {
        HP = 10;
    }

    public int getHP() {
        return HP;
    }
    public void takeDamage(int damage) {
        HP -= damage;
        if (HP <= 0) {
            System.out.println("Enemy killed!");
        } else {
            System.out.println("Enemy's health: " + HP);
        }
    }
}
