package sis.studentinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class Student {
    public static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "용인";

    enum Grade { A, B, C, D, F }

    private List<Grade> grades = new ArrayList<>();
    private GradingStrategy gradingStrategy = new RegularGradingStrategy();
    private String name;
    private int credits;
    private String state;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credit) {
        this.credits += credit;
    }

    public boolean isInState() {
        return IN_STATE.equals(state);
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStrategy = gradingStrategy;
    }

    public double getGpa() {
        if (grades.isEmpty()) {
            return 0;
        }

        double total = 0.0;
        for (Grade grade : grades) {
            total += gradingStrategy.getGradePointsFor(grade);
        }

        return total / grades.size();
    }
}
