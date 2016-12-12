package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 12. 12..
 */
public class StudentFactory {

    public static Student create(String name) {
        return new Student(name);
    }

    public static Student createNationalMerit(String name) {
        Student student = new Student(name);
        student.setNationalMerit(true);
        student.setGradeStrategy(new NationalMeritGradeStrategy());
        return student;
    }

    public static Student createDischarged(String name) {
        Student student = new Student(name);
        student.setDischarged(true);
        student.setGradeStrategy(new DischargedGradeStrategy());
        return student;
    }

}
