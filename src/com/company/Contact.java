package com.company;

public class Contact {

    private String name;
    private int phoneNo;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public Contact (String name , int phoneNo , String email)
    {
        this.name =  name;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}
