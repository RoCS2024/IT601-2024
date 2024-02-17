import com.shooting.game.enemy.Enemy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attackPoints=10, hitPoints=30;
        Enemy enemy = new Enemy(attackPoints, hitPoints);
        int input = 0;
        int playerHitPoints=50;

        System.out.println("Welcome to the Shooting Game!");
        System.out.println("Player has " + playerHitPoints + " HitPoints");
        System.out.println("Enemy has " + hitPoints + " HitPoints");

        do {
            System.out.println("\nChoose from the options: ");
            System.out.println("1. Attack the Player");
            System.out.println("2. Attacked by the Player");
            System.out.println("0. Exit Game");

            System.out.println("Type your choice: ");
                input = sc.nextInt();
                switch (input) {
                    case 1: {
                        if (playerHitPoints > 0) {
                            playerHitPoints -= attackPoints;
                            if (playerHitPoints < 0) {
                                playerHitPoints = 0;
                            }
                            System.out.println("Player was hit!");
                            System.out.println("Player Hit Points: " + playerHitPoints);
                            if (playerHitPoints == 0) {
                                System.out.println("Game Over! Player defeated!");
                                return;
                            }
                        } else {
                            System.out.println("Player already defeated!");
                        }
                        break;
                    }
                    case 2: {
                        hitPoints = enemy.receiveHit();
                        System.out.println("Enemy was hit!");
                        System.out.println("Enemy Hitpoints: " + hitPoints);
                        if (hitPoints <= 0) {
                            System.out.println("Enemy defeated!");
                            System.out.println("Spawning a new Enemy.. ");
                            hitPoints = 30;
                            enemy = new Enemy(attackPoints, hitPoints);
                            System.out.println("New Enemy Hitpoints: " + hitPoints);
                        }
                        break;
                    }
                    case 0: {
                        System.out.println("Quitting the game, Thank you for Playing!");
                        break;
                    }
                    default: {
                        System.out.println("Invalid option!!");
                        break;
                    }
                }
        } while(input != 0);
    }
}
