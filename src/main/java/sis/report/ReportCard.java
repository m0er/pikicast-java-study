package sis.report;

import sis.studentinfo.Student;

import java.util.EnumMap;
import java.util.Map;

/**
 * Created by AidenChoi on 2016. 12. 13..
 */
public class ReportCard {
    public static final String A_MESSAGE = "Excellent";
    public static final String B_MESSAGE = "Very good";
    public static final String C_MESSAGE = "Hmm...";
    public static final String D_MESSAGE = "You're not trying";
    public static final String F_MESSAGE = "Loser";

    private Map<Student.Grade, String> messages = null;

    public String getMessage(Student.Grade grade) {
        return getMessages().get(grade);
    }

    private Map<Student.Grade, String> getMessages() {
        if (messages == null) {
            loadMessages();
        }
        return messages;
    }

    private void loadMessages() {
        messages = new EnumMap<>(Student.Grade.class);
        messages.put(Student.Grade.A, A_MESSAGE);
        messages.put(Student.Grade.B, B_MESSAGE);
        messages.put(Student.Grade.C, C_MESSAGE);
        messages.put(Student.Grade.D, D_MESSAGE);
        messages.put(Student.Grade.F, F_MESSAGE);
    }
}
