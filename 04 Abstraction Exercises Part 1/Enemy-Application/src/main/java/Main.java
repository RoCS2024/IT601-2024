import com.shooting.game.enemy.Enemy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int enemyAP, enemyHP, input = 0, playerHP;
        int enemyHpHolder;

        System.out.println("Welcome to the Shooting Game!\n");

        while(true){
            System.out.print("Enter Player's hit points (HP): ");
            playerHP = sc.nextInt();
            if(playerHP > 100 || playerHP == 0) {
                System.out.println("Invalid input. Please enter numbers from 1 to 100");
            } else {
                break;
            }
        }

        while(true){
            System.out.print("Enter Enemy's hit points (HP): ");
            enemyHP = sc.nextInt();
            if(enemyHP > Enemy.maxHP || enemyHP == 0) {
                System.out.println("Invalid input. Please enter numbers from 1 to " + Enemy.maxHP);
            } else {
                break;
            }
        }
        enemyHpHolder = enemyHP;

        while(true){
            System.out.print("Enter Enemy's attack points: ");
            enemyAP = sc.nextInt();
            if(enemyAP > Enemy.maxAP ||enemyAP == 0) {
                System.out.println("Invalid input. Please enter numbers from 1 to " + Enemy.maxAP);
            } else {
                break;
            }
        }
        Enemy enemy = new Enemy(enemyAP, enemyHP);

        System.out.println("\nPlayer has " + playerHP + " HP");
        System.out.println("Enemy has " + enemyHP + " HP");
        System.out.println("Enemy has " + enemyAP + " Attack Points");

        do {
            System.out.println("\nEnemy's POV");
            System.out.println("Choose from the options: ");
            System.out.println("1. Attack the Player");
            System.out.println("2. Attacked by the Player");
            System.out.println("0. Exit Game");

            System.out.println("Type your choice: ");
                input = sc.nextInt();
                switch (input) {
                    case 1: {
                        if (playerHP > 0) {
                            playerHP -= enemyAP;
                            if (playerHP < 0) {
                                playerHP = 0;
                            }
                            System.out.println("Player was hit!");
                            System.out.println("Player Hit Points: " + playerHP);
                            if (playerHP == 0) {
                                System.out.println("Game Over! Player defeated!");
                                return;
                            }
                        } else {
                            System.out.println("Player already defeated!");
                        }
                        break;
                    }
                    case 2: {
                        enemyHP = enemy.receiveHit();
                        System.out.println("Enemy was hit!");
                        System.out.println("Enemy Hit points: " + enemyHP);
                        if (enemyHP <= 0) {
                            System.out.println("Enemy defeated!");
                            System.out.println("Spawning a new Enemy.. ");
                            enemyHP = enemyHpHolder;
                            enemy = new Enemy(enemyAP, enemyHP);
                            System.out.println("New Enemy Hit points: " + enemyHP);
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
