package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 12. 13..
 */
public class BasicGradeStrategy implements GradeStrategy {

    @Override
    public double getScoreByGrade(Student.Grade grade) {
        return grade.getScores();
    }

}
