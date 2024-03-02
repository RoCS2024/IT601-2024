package com.shooting.game.app;

public class Player extends Entity {
    private int experience;
    private int level;

    public Player() {
        super(50, 10);
        level = 1;
        experience = 0;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public void experienceGain() {
        experience += 10;
        levelUp();
    }

    private void levelUp() {
        if (experience >= 100) {
            level++;
            experience -= 100;
            attackPoints += 3;
            hitpoints += 5;
        }
    }

    public void Attack(Enemy enemy) {
        enemy.takeDamage(attackPoints);
    }

    public void takeDamage(int damage) {
        hitpoints -= damage;
        if (hitpoints <= 0) {
            hitpoints = 0;
        }
    }

    public void acquireFood() {
        hitpoints += 20;
    }
}
