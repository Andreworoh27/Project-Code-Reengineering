package model;

public class Branch {
    String branchId = "";
    String branchName = "";
    String address = "";
    String telephone = "";

    public Branch() {

    }

    public Branch(String branchId, String branchName, String address, String telephone) {
        this.branchId = branchId;
        this.branchName = branchName;
        this.address = address;
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
