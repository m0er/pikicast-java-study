package day03.sis;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSession {
    private String department;
    private String number;
    private List<Student> allStudents;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        allStudents = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return allStudents.size();
    }

    public void enroll(Student student) {
        allStudents.add(student);
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    public Student get(int index) {
        return allStudents.get(index);
    }
}
