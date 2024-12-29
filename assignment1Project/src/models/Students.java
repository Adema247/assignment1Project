package models;

import java.util.*;

public final class Students extends Person {
    private static int idCounter = 1;
    private final int studentID;
    private final List<Integer> grades;

    public Students(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>(grades);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double totalPoints = 0.0;
        for (Integer grade : grades) {
            if (grade >= 90) {
                totalPoints += 4.0;
            } else if (grade >= 80) {
                totalPoints += 3.0;
            } else if (grade >= 70) {
                totalPoints += 2.0;
            } else if (grade >= 60) {
                totalPoints += 1.0;
            } else {
                totalPoints += 0.0;
            }
        }
        return totalPoints / grades.size();
    }
    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + " .GPA: " + calculateGPA();
    }
}
