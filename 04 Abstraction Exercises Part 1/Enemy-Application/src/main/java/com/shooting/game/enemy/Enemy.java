package com.shooting.game.enemy;

public class Enemy {
    private int attackPoints;
    private int hitPoints;

    public Enemy(int attackPoints, int hitPoints) {
        this.attackPoints = attackPoints;
        this.hitPoints = hitPoints;
    }

    public int receiveHit() {
        return hitPoints -= 10;
    }
}
