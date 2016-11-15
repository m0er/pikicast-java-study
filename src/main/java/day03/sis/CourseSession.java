package day03.sis;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSession {
    private String department;
    private String number;

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
}
