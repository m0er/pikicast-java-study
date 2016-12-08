package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 12. 8..
 */
public interface GradingStrategy {
    int getGradePointsFor(Student.Grade grade);
}
