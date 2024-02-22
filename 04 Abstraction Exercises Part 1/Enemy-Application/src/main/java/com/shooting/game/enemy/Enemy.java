package com.shooting.game.enemy;

public class Enemy {
    private int attackPoints;
    private int hitPoints;

    public static int maxAP=20;
    public static int maxHP=100;

    public Enemy(int attackPoints, int hitPoints) {
        this.attackPoints = attackPoints;
        this.hitPoints = hitPoints;
    }

    public int receiveHit() {
        return hitPoints -= 10;
    }
}
