package sis;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;

/**
 * Created by AidenChoi on 2016. 11. 20..
 */
public class DateUtilTest {
    private Date startDate;
    private CourseSession session;

    @Before
    public void setUp() {
        startDate = new DateUtil().createDate(2016, 1, 4);
        session = new CourseSession("이산수학", "100", startDate);
    }

    @Test
    public void courseDates() {
        final Date sixteenWeeksOut = new DateUtil().createDate(2016, 4, 22);
        assertThat(session.getEndDate(), is(sixteenWeeksOut));
    }
}
