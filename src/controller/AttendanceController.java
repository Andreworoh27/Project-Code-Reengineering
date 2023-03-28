package controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Clock;

import model.Employee;

// handle attendace operation
public class AttendanceController {
    private static Authentication authentication = Authentication.getInstance();

    public static void attend() {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);
        
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(currentDate);

        

    }
}
