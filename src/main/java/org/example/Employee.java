package org.example;
public class Employee {
    private String firstName;
    private String lastName;
    private Integer empID;
    private String designation;
//    private String[] Address;

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getdesignation() {
        return designation;
    }

    public void setdesignation(String designation) {
        this.designation = designation;
    }

//    public String[] getAddress() {
//        return Address;
//    }
//
//    public void setAddress(String[] address) {
//        this.Address = address;
//    }

    @Override
    public String toString() {
        return "Employee [First Name= "+firstName+ ", Last Name= "+lastName+ ", Employee ID= "+empID+ ", designation= " +designation+ "]";
    }
}