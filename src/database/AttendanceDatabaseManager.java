package database;

import java.util.ArrayList;

import controller.Authentication;
import model.Attendance;

// handle read, and insert for attendance
public class AttendanceDatabaseManager {
    private static AttendanceDatabaseManager instance = null;
    private static ArrayList<Attendance> attendanceList = new ArrayList<>();

    public static AttendanceDatabaseManager getInstance() {
        if (instance == null) {
            synchronized (AttendanceDatabaseManager.class) {
                if (instance == null) {
                    instance = new AttendanceDatabaseManager();
                }
            }
        }
        return instance;
    }

    private AttendanceDatabaseManager() {
    }

    public ArrayList<Attendance> getAllAttendace() {
        return attendanceList;
    }

    public void addAttendace(Attendance attendace) {
        attendanceList.add(attendace);
    }

    public Attendance findCurrentUserAttendace(String employeeId, String CurrentDate) {
        for (Attendance attendance : attendanceList) {
            if (attendance.getUserId().equals(employeeId) && attendance.getAttendanceDate().equals(CurrentDate)) {
                return attendance;
            }
        }
        return null;
    }

}
