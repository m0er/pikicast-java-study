package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 12. 12..
 */
public class DischargedGradeStrategy extends BasicGradeStrategy {
    @Override
    public double getScoreByGrade(Student.Grade grade) {
        double scores = super.getScoreByGrade(grade);
        if (scores > 0) {
            scores += 0.5;
        }
        return scores;
    }
}
