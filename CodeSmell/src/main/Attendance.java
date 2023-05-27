package main;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Attendance {
	private static ArrayList<Attendance> attendanceList = new ArrayList<>();
	private String clockIn = "";
    private String clockOut = "";
    private Integer attendanceCount = 0;
    private String attendanceId = "";
    private String attendanceDate = "";
    private String userId = "";
    
    public static int attend() {
        Date currentDate = new Date();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(currentDate);

        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String formattedTime = timeFormat.format(currentDate);

        Attendance attendance = findCurrentUserAttendace(Employee.getCurrentEmployee().getEmployeeId(),
                formattedDate);

        if (attendance == null) {
            String clockIn = formattedTime;

            attendance = new Attendance(formattedDate, Employee.getCurrentEmployee().getEmployeeId(), clockIn, null);
            addAttendace(attendance);
            attendance = findCurrentUserAttendace(Employee.getCurrentEmployee().getEmployeeId(),
                    formattedDate);
            System.out.println("user id : " + attendance.getUserId());
            System.out.println("date : " + attendance.getAttendanceDate());
            System.out.println("clock in : " + attendance.getClockIn());
            System.out.println("clock out : " + attendance.getClockOut());
            return 0;
        } else {
            if (attendance.getAttendanceCount() == 1) {
                
                attendance.setClockOut(formattedTime);
                System.out.println("user id : " + attendance.getUserId());
                System.out.println("date : " + attendance.getAttendanceDate());
                System.out.println("clock in : " + attendance.getClockIn());
                System.out.println("clock out : " + attendance.getClockOut());
                return 1;
            } else {
                return 2;
            }
        }
    }
    
    public Attendance(String attendaceDate, String userId, String clockIn, String clockOut) {
        attendanceId = String.format("AT%3d", attendanceCount + 1);
        this.attendanceDate = attendaceDate;
        this.userId = userId;
        this.clockIn = clockIn;
        this.clockOut = clockOut;
        attendanceCount++;
    }
    
    public static void addAttendace(Attendance attendace) {
        attendanceList.add(attendace);
    }

    public static Attendance findCurrentUserAttendace(String employeeId, String CurrentDate) {
        for (Attendance attendance : attendanceList) {
            if (attendance.getUserId().equals(employeeId) && attendance.getAttendanceDate().equals(CurrentDate)) {
                return attendance;
            }
        }
        return null;
    }
    
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getClockIn() {
		return clockIn;
	}

	public void setClockIn(String clockIn) {
		this.clockIn = clockIn;
	}

	public String getClockOut() {
		return clockOut;
	}

	public void setClockOut(String clockOut) {
		this.clockOut = clockOut;
	}

	public Integer getAttendanceCount() {
		return attendanceCount;
	}

	public void setAttendanceCount(Integer attendanceCount) {
		this.attendanceCount = attendanceCount;
	}

	public String getAttendanceId() {
		return attendanceId;
	}

	public void setAttendanceId(String attendanceId) {
		this.attendanceId = attendanceId;
	}

	public String getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(String attendanceDate) {
		this.attendanceDate = attendanceDate;
	}
	
}
