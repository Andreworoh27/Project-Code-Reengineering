package controller;

import java.util.Date;

import database.AttendanceDatabaseManager;

import java.text.SimpleDateFormat;
import model.Attendance;
import model.Clock;
import model.Employee;

// handle attendace operation
public class AttendanceController {
    private static Authentication authentication = Authentication.getInstance();
    private static AttendanceDatabaseManager attendaceDb = AttendanceDatabaseManager.getInstance();

    public static int attend() {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(currentDate);

        Attendance attendance = attendaceDb.findCurrentUserAttendace(authentication.getCurrentUser().getEmployeeId(),
                formattedDate);

        if (attendance == null) {
            Clock clock = new Clock();
            clock.setClockIn(formattedTime);

            attendance = new Attendance(formattedDate, authentication.getCurrentUser().getEmployeeId(), clock);
            attendaceDb.addAttendace(attendance);
            attendance = attendaceDb.findCurrentUserAttendace(authentication.getCurrentUser().getEmployeeId(),
                    formattedDate);
            System.out.println("user id : " + attendance.getUserId());
            System.out.println("date : " + attendance.getAttendanceDate());
            System.out.println("clock in : " + attendance.getClock().getClockIn());
            System.out.println("clock out : " + attendance.getClock().getClockOut());
            return 0;
        } else {
            if (attendance.getAttendanceCount() == 1) {
                Clock clock = attendance.getClock();
                clock.setClockOut(formattedTime);
                System.out.println("user id : " + attendance.getUserId());
                System.out.println("date : " + attendance.getAttendanceDate());
                System.out.println("clock in : " + attendance.getClock().getClockIn());
                System.out.println("clock out : " + attendance.getClock().getClockOut());
                return 1;
            } else {
                return 2;
            }
        }
    }
}
