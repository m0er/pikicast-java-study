package sis.studentinfo;

import static sis.studentinfo.Student.Grade.*;

/**
 * Created by AidenChoi on 2016. 12. 12..
 */
public class DischargedGradeStrategy implements GradeStrategy {
    @Override
    public double getScoreByGrade(Student.Grade grade) {
        double scores = basicGradeScore(grade);
        if (scores > 0) {
            scores += 0.5;
        }
        return scores;
    }

    public int basicGradeScore(Student.Grade grade) {
        switch (grade) {
            case A: return 4;
            case B: return 3;
            case C: return 2;
            case D: return 1;
            default: return 0;
        }
    }
}
