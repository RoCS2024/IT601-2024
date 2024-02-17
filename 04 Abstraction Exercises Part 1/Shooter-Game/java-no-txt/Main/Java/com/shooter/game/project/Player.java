package com.shooter.game.project;

public class Player {
    private int level;
    private int experience;
    private int AP;
    private int HP;

    public Player() {
        level = 1;
        experience = 0;
        AP = 10;
        HP = 50;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getAP() {
        return AP;
    }

    public int getHP() {
        return HP;
    }

    public void levelUp() {
        if (experience >= 100) {
            System.out.println("You've LEVEL UP!");
            level++;
            experience -= 100;
            AP += 3;
            HP += 5;
        }
    }

    public void experienceGain() {
        experience += 10;
        levelUp();
    }

    public void Attack(Enemy enemy) {
        enemy.takeDamage(AP);
    }

    public void takeDamage(int damage) {
        HP -= damage;
        if (HP <= 0) {
            System.out.println("You died. Game over!");
            System.exit(0);
        }
    }

    public void acquireFood() {
        HP += 20;
    }
}
