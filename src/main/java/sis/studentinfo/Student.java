package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class Student {
    private String name;
    private int credits;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isFullTime() {
        return false;
    }

    public int getCredits() {
        return credits;
    }

    public void addCredits(int credits) {
        this.credits += credits;
    }
}
