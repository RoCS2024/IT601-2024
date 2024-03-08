import com.virtual.pet.Pet;
import com.virtual.pet.bird.Bird;
import com.virtual.pet.cat.Cat;
import com.virtual.pet.dog.Dog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("\nWelcome to Tamagochi!");
        Scanner sc = new Scanner(System.in);
        int choice;
        try {
            do {
                displayMenu();
                System.out.print("\nChoose a pet: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Name your dog: ");
                        String dogName = sc.next();
                        Pet dog = new Dog(dogName);
                        int action;
                        do {
                            System.out.println("\nWhat would you like to do with " + dogName + "?");
                            System.out.println("1. Feed");
                            System.out.println("2. Play");
                            System.out.println("0. Change pet");
                            System.out.print("Choose an action: ");
                            action = sc.nextInt();

                            switch (action) {
                                case 1:
                                    dog.feed();
                                    break;
                                case 2:
                                    dog.play();
                                    break;
                                case 0:
                                    System.out.println("\nChanging pet...");
                                    break;
                                default:
                                    System.out.println("Invalid action!");
                                    break;
                            }
                        } while(action != 0);
                        break;
                    case 2:
                        System.out.print("Name your cat: ");
                        String catName = sc.next();
                        Pet cat = new Cat(catName);
                        int action2;
                        do {
                            System.out.println("\nWhat would you like to do with " + catName + "?");
                            System.out.println("1. Feed");
                            System.out.println("2. Play");
                            System.out.println("0. Change pet");
                            System.out.print("Choose an action: ");
                            action2 = sc.nextInt();

                            switch (action2) {
                                case 1:
                                    cat.feed();
                                    break;
                                case 2:
                                    cat.play();
                                    break;
                                case 0:
                                    System.out.println("\nChanging pet...");
                                    break;
                                default:
                                    System.out.println("Invalid action!");
                                    break;
                            }
                        } while(action2 != 0);
                        break;
                    case 3:
                        System.out.print("Name your bird: ");
                        String birdName = sc.next();
                        Pet bird = new Bird(birdName);
                        int action3;
                        do {
                            System.out.println("\nWhat would you like to do with " + birdName + "?");
                            System.out.println("1. Feed");
                            System.out.println("2. Play");
                            System.out.println("0. Change pet");
                            System.out.print("Choose an action: ");
                            action3 = sc.nextInt();

                            switch (action3) {
                                case 1:
                                    bird.feed();
                                    break;
                                case 2:
                                    bird.play();
                                    break;
                                case 0:
                                    System.out.println("\nChanging pet...");
                                    break;
                                default:
                                    System.out.println("Invalid action!");
                                    break;
                            }
                        } while(action3 != 0);
                        break;
                    case 0:
                        System.out.println("Shutting down...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please enter a valid option.");
                        break;
                }
            } while (choice != 0);
            sc.close();
        } catch (Exception e) {
            System.out.println("Input must be an integer. Please try again.");
        }

    }

    public static void displayMenu() {
        System.out.println("\n1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.println("0. Exit");
    }

}