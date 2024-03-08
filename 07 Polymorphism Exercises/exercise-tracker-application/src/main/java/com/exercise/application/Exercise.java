package com.exercise.application;

import java.sql.Timestamp;

public class Exercise {
    protected String name;
    protected int duration;
    protected int caloriesBurned;
    protected int averageHeartRate;

    public Exercise(String name, int duration, int caloriesBurned, int averageHeartRate) {
        this.name = name;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
        this.averageHeartRate = averageHeartRate;
    }

    public void trackWorkoutData() {
        System.out.println("Tracking workout data for " + name + "...");
        System.out.println("Average Heart Rate: " + averageHeartRate + " bpm");
    }

    public void displayExercise() {
        System.out.println("Exercise: " + name);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Calories Burned: " + caloriesBurned);
        System.out.println("Average Heart Rate: " + averageHeartRate + " bpm");
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public int getAverageHeartRate() {
        return averageHeartRate;
    }
}
