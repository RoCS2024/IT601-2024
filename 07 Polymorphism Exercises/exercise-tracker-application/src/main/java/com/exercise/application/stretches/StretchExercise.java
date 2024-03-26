package com.exercise.application.stretches;

import com.exercise.application.Exercise;

import java.sql.Timestamp;

public class StretchExercise extends Exercise {
    private String intensity;

    public StretchExercise(String name, int duration, int caloriesBurned, int averageHeartRate, String intensity) {
        super(name, duration, caloriesBurned, averageHeartRate);
        this.intensity = intensity;
    }

    @Override
    public void displayExercise() {
        super.displayExercise();
        System.out.println("Intensity: " + intensity);
    }
}