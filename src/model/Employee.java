package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Employee {
    private String employeeId = "";
    private String name = "";
    private String telephone = "";
    private String address = "";
    private String password = "";
    private int salaryPerHour;

    public Employee() {

    }

    public Employee(String employeeId, String name, String telephone, String address, int salaryPerHour,
            String password) {
        this.employeeId = employeeId;
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.salaryPerHour = salaryPerHour;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmployeeId() {
        return employeeId;
    }

}
