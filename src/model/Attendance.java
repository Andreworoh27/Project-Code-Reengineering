package model;

import java.text.SimpleDateFormat;

public class Attendance {
    private static Integer attendanceCount = 0;
    private String attendanceId = "";
    private String attendanceDate;
    private String userId = "";
    private Clock clock;

    public Attendance(SimpleDateFormat attendaceDate, String userId, Clock clock) {
        attendanceId = String.format("AT%3d", attendanceCount++);
    }

    public static Integer getAttendanceCount() {
        return attendanceCount;
    }

    public String getAttendanceId() {
        return attendanceId;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public Clock getClock() {
        return clock;
    }

    public String getUserId() {
        return userId;
    }

    public static void setAttendanceCount(Integer attendanceCount) {
        Attendance.attendanceCount = attendanceCount;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public void setAttendanceId(String attendanceId) {
        this.attendanceId = attendanceId;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
