package com.shooting.game.app;

public class Entity {
    protected int hitpoints;
    protected int attackPoints;

    public Entity(int hitpoints, int attackPoints) {
        this.hitpoints = hitpoints;
        this.attackPoints = attackPoints;
    }

    public void takeDamage(int damage) {
        hitpoints -= damage;
        if (hitpoints <= 0) {
            hitpoints = 0;
        }
    }
}
