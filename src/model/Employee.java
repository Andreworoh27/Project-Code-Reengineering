package model;
import java.text.SimpleDateFormat;

public class Employee {
    private String dateFormat = "HH:mm:ss";
    private String userId = "";
    private SimpleDateFormat clockIn = new SimpleDateFormat(dateFormat);
    private SimpleDateFormat clockOut = new SimpleDateFormat(dateFormat);
    private String name = "";
    private SimpleDateFormat dob = new SimpleDateFormat(dateFormat);
    private String telephone = "";
    private String address = "";
    private String branchId = "";
    private int salaryPerHour;

    public Employee(){

    }

    public Employee(String name,SimpleDateFormat dob,String telephone,String address,String branchId,int salaryPerHour){
        this.name = name;
        this.dob = dob;
        this.telephone = telephone;
        this.address = address;
        this.branchId = branchId;
        this.salaryPerHour = salaryPerHour;
    }

    

    /**
     * @return String return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return SimpleDateFormat return the clockIn
     */
    public SimpleDateFormat getClockIn() {
        return clockIn;
    }

    /**
     * @param clockIn the clockIn to set
     */
    public void setClockIn(SimpleDateFormat clockIn) {
        this.clockIn = clockIn;
    }

    /**
     * @return SimpleDateFormat return the clockOut
     */
    public SimpleDateFormat getClockOut() {
        return clockOut;
    }

    /**
     * @param clockOut the clockOut to set
     */
    public void setClockOut(SimpleDateFormat clockOut) {
        this.clockOut = clockOut;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return SimpleDateFormat return the dob
     */
    public SimpleDateFormat getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(SimpleDateFormat dob) {
        this.dob = dob;
    }

    /**
     * @return String return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return String return the branchId
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * @param branchId the branchId to set
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }


    /**
     * @return int return the salaryPerHour
     */
    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    /**
     ** @param salaryPerHour the salaryPerHour to set
     */
    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
}
