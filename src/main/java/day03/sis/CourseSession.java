package day03.sis;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSession {
    private String department;
    private String number;
    private int numberOfStudents;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void enroll(Student student) {
        numberOfStudents++;
    }
}
