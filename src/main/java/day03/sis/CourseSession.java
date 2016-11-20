package day03.sis;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 11. 15..
 */
public class CourseSession {
    private Date startDate;
    private String department;
    private String number;
    private List<Student> allStudents;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        allStudents = new ArrayList<>();
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

    public int getNumberOfStudents() {
        return allStudents.size();
    }

    public void enroll(Student student) {
        allStudents.add(student);
    }

    public Student get(int index) {
        return allStudents.get(index);
    }

    public Date getEndDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3; // 토, 일, 월 제외
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public Date getStartDate() {
        return startDate;
    }
}
