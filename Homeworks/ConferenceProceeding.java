package Homeworks;

import java.util.Calendar;

public class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;

    public ConferenceProceeding(String name, Calendar apparition, int numberOfAuthors, String volumeName,
            boolean indexed) {
        super(name, apparition, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }

    
    public double computeScore() {
        if (indexed)
            return 0.25 / super.numberOfAuthors;
        return 0.2 / super.numberOfAuthors;
    }
}
