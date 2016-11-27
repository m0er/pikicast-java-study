package sis.studentinfo;

import sis.util.DateUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class CourseSession {
    private static int count;
    private final String department;
    private final String number;
    private List<Student> students;
    private Date startDate;

    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.students = new ArrayList<>();
        this.startDate = startDate;
        CourseSession.count = CourseSession.count + 1;
    }

    private static void incrementCount() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    public void enroll(Student student) {
        students.add(student);
    }

    int getStudentCount() {
        return students.size();
    }

    Student getStudent(int position) {
        return students.get(position - 1);
    }

    public Date getEndDate() {
        return DateUtil.getEndDate(startDate);
    }

    public static void resetCount() {
        count = 0;
    }
}
