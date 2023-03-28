package database;

import java.util.ArrayList;

import model.Attendance;

// handle read, and insert for attendance
public class AttendanceDatabaseManager {
    private static AttendanceDatabaseManager instance = null;
    private static ArrayList<Attendance> attendanceList = new ArrayList<>();

    private static AttendanceDatabaseManager getInstance() {
        if (instance == null) {
            synchronized (AttendanceDatabaseManager.class) {
                if (instance == null) {
                    instance = new AttendanceDatabaseManager();
                }
            }
        }
        return instance;
    }

}
