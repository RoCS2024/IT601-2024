import com.exercise.application.Exercise;
import com.exercise.application.strength.StrengthExercise;
import com.exercise.application.stretches.StretchExercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Exercise> exercises = new ArrayList<>();

        int choice;
            do {
                System.out.println("Choose exercise type \n[1] Strength \n[2] Stretch \n[0] Exit");
                System.out.println("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 0) {
                    System.out.println("Exiting the App...");
                    break;
                }

                System.out.println("Enter exercise name:");
                String exerciseName = scanner.nextLine();

                System.out.println("Enter duration (minutes):");
                int duration = scanner.nextInt();

                System.out.println("Enter calories burned:");
                int caloriesBurned = scanner.nextInt();

                System.out.println("Enter average heart rate (bpm):");
                int averageHeartRate = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter sets:");
                        int sets = scanner.nextInt();

                        System.out.println("Enter reps per set:");
                        int reps = scanner.nextInt();

                        StrengthExercise strengthExercise = new StrengthExercise(exerciseName, duration, caloriesBurned, averageHeartRate, sets, reps);
                        exercises.add(strengthExercise);
                        break;
                    case 2:
                        System.out.println("Enter intensity:");
                        String intensity = scanner.next();

                        StretchExercise stretchExercise = new StretchExercise(exerciseName, duration, caloriesBurned, averageHeartRate, intensity);
                        exercises.add(stretchExercise);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }

                int option;
                do {
                    System.out.println("\nWhat would you like to do next?");
                    System.out.println("[1] Display exercise details");
                    System.out.println("[2] Track workout data");
                    System.out.println("[0] Go Back");
                    System.out.println("Enter your choice: ");
                    option = scanner.nextInt();
                    scanner.nextLine();

                    switch (option) {
                        case 1:
                            System.out.println("\nExercise Details:");
                            for (Exercise exercise : exercises) {
                                displayExerciseDetails(exercise);
                            }
                            break;

                        case 2:
                            System.out.println("\nTracking Workout Data:");
                            for (Exercise exercise : exercises) {
                                exercise.trackWorkoutData();
                            }
                            int totalCaloriesBurned = calculateTotalCaloriesBurned(exercises);
                            System.out.println("\nTotal calories burned: " + totalCaloriesBurned);

                            break;

                        case 0:
                            exercises.clear();
                            System.out.println("Going Back...");
                            break;
                        default:
                            System.out.println("Invalid option!");
                    }
                } while (option != 0);
            } while (choice != 0);
        scanner.close();
    }

    public static void displayExerciseDetails(Exercise exercise) {
        exercise.displayExercise();
        System.out.println();
    }

    public static int calculateTotalCaloriesBurned(ArrayList<Exercise> exercises) {
        int totalCaloriesBurned = 0;
        for (Exercise exercise : exercises) {
            totalCaloriesBurned += exercise.getCaloriesBurned();
        }
        return totalCaloriesBurned;
    }
}
