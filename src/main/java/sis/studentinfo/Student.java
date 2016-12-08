package sis.studentinfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class Student {
    public static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "용인";

    private List<String> grades = new ArrayList<>();
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

    public void addGrade(String grade) {
        grades.add(grade);
    }

    public double getGpa() {
        if (grades.isEmpty()) {
            return 0;
        }

        double total = 0.0;
        for (String grade : grades) {
            if (grade.equals("A"))
                total += 4;
            else if (grade.equals("B"))
                total += 3;
            else if (grade.equals("C"))
                total += 2;
            else if (grade.equals("D"))
                total += 1;
        }

        return total / grades.size();
    }
}
