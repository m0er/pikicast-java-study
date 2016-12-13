package sis.studentinfo;

/**
 * Created by AidenChoi on 2016. 12. 13..
 */
public class BasicGradeStrategy implements GradeStrategy {

    @Override
    public double getScoreByGrade(Student.Grade grade) {
        switch (grade) {
            case A: return 4;
            case B: return 3;
            case C: return 2;
            case D: return 1;
            default: return 0;
        }
    }

}
