package sis.report;

import org.junit.Test;
import sis.studentinfo.Student;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 12. 13..
 */
public class ReportCardTest {

    @Test
    public void message() {
        ReportCard card = new ReportCard();
        assertThat(ReportCard.A_MESSAGE, card.getMessage(Student.Grade.A));
        assertThat(ReportCard.B_MESSAGE, card.getMessage(Student.Grade.B));
        assertThat(ReportCard.C_MESSAGE, card.getMessage(Student.Grade.C));
        assertThat(ReportCard.D_MESSAGE, card.getMessage(Student.Grade.D));
        assertThat(ReportCard.F_MESSAGE, card.getMessage(Student.Grade.F));
    }
}
