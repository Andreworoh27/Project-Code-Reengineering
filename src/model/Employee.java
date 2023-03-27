package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Employee {
    private String dateFormat = "HH:mm:ss";
    private String employeeId = "";
    private String name = "";
    private SimpleDateFormat dob = new SimpleDateFormat(dateFormat);
    private String telephone = "";
    private String address = "";
    private String branchId = "";
    private String password = "";
    private boolean isAuthenticate;
    private int salaryPerHour;

    public Employee() {

    }

    public Employee(String name, SimpleDateFormat dob, String telephone, String address, String branchId,
        int salaryPerHour) {
        this.name = name;
        this.dob = dob;
        this.telephone = telephone;
        this.address = address;
        this.branchId = branchId;
        this.salaryPerHour = salaryPerHour;
        this.isAuthenticate = false;
    }

    /**
     * @return String return the employeeId
     */
    public String getemployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setemployeeId(String employeeId) {
        this.employeeId = employeeId;
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

    public String getDateFormat() {
        return dateFormat;
    }

    public String getPassword() {
        return password;
    }

    public boolean getAuthenticate() {
        return isAuthenticate;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setAuthenticate(boolean isAuthenticate) {
        this.isAuthenticate = isAuthenticate;
    }

}
