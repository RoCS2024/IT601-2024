package com.exercise.application.strength;

import com.exercise.application.Exercise;

public class StrengthExercise extends Exercise {
    private int sets;
    private int reps;

    public StrengthExercise(String name, int duration, int caloriesBurned, int averageHeartRate, int sets, int reps) {
        super(name, duration, caloriesBurned, averageHeartRate);
        this.sets = sets;
        this.reps = reps;
    }

    @Override
    public void displayExercise() {
        super.displayExercise();
        System.out.println("Sets: " + sets);
        System.out.println("Reps per set: " + reps);
    }
}
