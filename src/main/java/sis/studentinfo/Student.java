package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class Student {
    public static final int CREDITS_REQUIRED_FOR_FULL_TIME = 12;
    private String name;
    private int credits;

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

    public void addCredits(int credits) {
        this.credits += credits;
    }
}
