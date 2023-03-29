package model;

import java.text.SimpleDateFormat;

public class Clock {
    private String clockIn = "";
    private String clockOut = "";

    public Clock() {

    }

    public Clock(String clockIn, String clockOut) {
        this.clockIn = clockIn;
        this.clockOut = clockOut;
    }

    public String getClockIn() {
        return clockIn;
    }

    public String getClockOut() {
        return clockOut;
    }

    public void setClockIn(String clockIn) {
        this.clockIn = clockIn;
    }

    public void setClockOut(String clockOut) {
        this.clockOut = clockOut;
    }
}
