package com.celllphone.app;
/**
 * Smartphone class represents a smartphone that extends Cellphone and can consume data.
 */
public class Smartphone  extends Cellphone{

        public Smartphone(double initialLoad, String network, String model) {
            super(initialLoad, network, model);
        }

        @Override
        public void useData(double dataUsage) {
            // Deduct load for data usage specific to smartphones
            double dataCost = dataUsage * 0.2;
            deductLoad(dataCost);
            System.out.println("Data used: " + dataUsage + " MB. Load deducted: " + dataCost);
        }
}
