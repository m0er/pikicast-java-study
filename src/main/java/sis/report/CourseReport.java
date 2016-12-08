package sis.report;

import sis.studentinfo.CourseSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by AidenChoi on 2016. 12. 8..
 */
public class CourseReport {
    private List<CourseSession> sessions = new ArrayList<>();

    public void add(CourseSession session) {
        sessions.add(session);
    }

    public String text() {
        Collections.sort(sessions);
        StringBuilder builder = new StringBuilder();
        for (CourseSession session : sessions) {
            builder.append(session.getDepartment());
            builder.append(ReportConstant.SPACE);
            builder.append(session.getNumber());
            builder.append(ReportConstant.NEWLINE);
        }
        return builder.toString();
    }
}
