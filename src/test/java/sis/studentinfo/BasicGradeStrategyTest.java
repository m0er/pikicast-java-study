package sis.studentinfo;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 12. 13..
 */
public class BasicGradeStrategyTest {

    @Test
    public void getScoreByGrade() {
        GradeStrategy strategy = new BasicGradeStrategy();
        assertThat(strategy.getScoreByGrade(Student.Grade.A), is(4.0));
        assertThat(strategy.getScoreByGrade(Student.Grade.B), is(3.0));
        assertThat(strategy.getScoreByGrade(Student.Grade.C), is(2.0));
        assertThat(strategy.getScoreByGrade(Student.Grade.D), is(1.0));
        assertThat(strategy.getScoreByGrade(Student.Grade.F), is(0.0));
    }
}
