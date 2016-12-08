package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 12. 8..
 */
public class NationalMeritGradingStrategy implements GradingStrategy {

    @Override
    public int getGradePointsFor(Student.Grade grade) {
        if (grade == Student.Grade.A) return 5;
        if (grade == Student.Grade.B) return 4;
        if (grade == Student.Grade.C) return 3;
        if (grade == Student.Grade.D) return 2;
        return 1;
    }
}
