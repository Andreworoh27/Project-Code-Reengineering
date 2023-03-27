package model;

import java.text.SimpleDateFormat;

public class Clock {
    private String dateFormat = "HH:mm:ss";
    private SimpleDateFormat clockIn = new SimpleDateFormat(dateFormat);
    private SimpleDateFormat clockOut = new SimpleDateFormat(dateFormat);

    public Clock(){

    }

    public Clock (SimpleDateFormat clockIn, SimpleDateFormat clockOut){
        this.clockIn = clockIn;
        this.clockOut = clockOut;
    }

    public SimpleDateFormat getClockIn() {
        return clockIn;
    }
    public SimpleDateFormat getClockOut() {
        return clockOut;
    }
    public void setClockIn(SimpleDateFormat clockIn) {
        this.clockIn = clockIn;
    }
    public void setClockOut(SimpleDateFormat clockOut) {
        this.clockOut = clockOut;
    }
}
