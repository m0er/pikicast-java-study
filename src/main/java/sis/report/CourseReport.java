package sis.report;

import sis.studentinfo.CourseSession;

import java.util.ArrayList;
import java.util.Collections;

import static sis.report.ReportConstant.NEWLINE;

/**
 * Created by AidenChoi on 2016. 12. 7..
 */
public class CourseReport {
    private ArrayList<CourseSession> sessions = new ArrayList<>();

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
//        Collections.sort(sessions);
        StringBuilder builder = new StringBuilder();
        for (CourseSession session : sessions) {
            builder.append(
                    session.getDepartment() + " " +
                    session.getNumber() + NEWLINE);
        }
        return builder.toString();
    }
}
