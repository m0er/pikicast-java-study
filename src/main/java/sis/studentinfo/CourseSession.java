package sis.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 11. 16..
 */
public class CourseSession {
    private final String department;
    private final String number;
    private List<Student> studentList;
    private Date startDate;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        this.studentList = new ArrayList<>();
    }

    public CourseSession(String department, String number, Date startDate) {
        this(department, number);
        this.startDate = startDate;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public void enroll(Student student) {
        studentList.add(student);
    }

    public int getStudentCount() {
        return studentList.size();
    }

    public Student getStudent(int position) {
        return studentList.get(position - 1);
    }

    public Date getEndDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.setTime(startDate);
        calendar.add(Calendar.DAY_OF_YEAR, 16 * 7 - 3);
        return calendar.getTime();
    }

    public List<Student> getAllStudents() {
        return studentList;
    }
}