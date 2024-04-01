package com.shooter.game.project;

public class Player {
    private int level;
    private int experience;
    private int attackdamage;
    private int health;

    public Player() {
        level = 1;
        experience = 0;
        attackdamage = 10;
        health = 50;
    }

    public int getLevel() {
        return level;
    }

    public int getExperience() {
        return experience;
    }

    public int getAP() {
        return attackdamage;
    }

    public int getHP() {
        return health;
    }

    private void levelUp() {
        if (experience >= 100) {
            System.out.println("You've LEVEL UP!");
            level++;
            experience -= 100;
            attackdamage += 3;
            health += 5;
            System.out.println("Your initial stats: HP - " + health + ", AP - " + attackdamage + ", Level - " + level + ", Experience - " + experience);
        }
    }

    public void experienceGain() {
        experience += 10;
        levelUp();
    }

    public void Attack(Enemy enemy) {
        enemy.takeDamage(attackdamage);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println("You died. Game over!");
            System.exit(0);
        }
    }

    public void acquireFood() {
        health += 20;
    }
}
