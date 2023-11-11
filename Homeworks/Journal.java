package Homeworks;

import java.util.Calendar;

class Journal extends Publication {
    private String journalName;
    private double impactFactor;

    public Journal(String name, Calendar apparition, int numberOfAuthors, String journalName, double impactFactor) {
        super(name, apparition, numberOfAuthors);
        this.journalName = journalName;
        this.impactFactor = impactFactor;
    }

    
    public double computeScore() {
        return (impactFactor * 0.5) / super.numberOfAuthors;
    }
}