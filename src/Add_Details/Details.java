/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Add_Details;

/**
 *
 * @author Low
 */
public class Details {
    
    String allInfo="";
    String salution,staffID,lastName,firstName,mobile,address,birthday;
//    public Details(String salution, String staffID,String lastName,String firstName, String mobile,String address,String birthday) {
    public Details(String allInfo){
      this.allInfo=allInfo;
//    this.salution=salution;
//    this.staffID=staffID;
//    this.lastName=lastName;
//    this.firstName=firstName;
//    this.mobile=mobile;
//    this.address=address;
//    this.birthday=birthday;
    }
    public String getAllInfo(){
        return allInfo;
    }
    public void setAllInfo(String allInfo){
        this.allInfo=allInfo;
    }
    public String getSalution() {
        return salution;
    }

    public void setSalution(String salution) {
        this.salution = salution;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    @Override
    public String toString() {
    return String.format(" %-100s\n", allInfo);
  }
}
