package com.company;

public class Passenger {

    private static int idCounter;
    // attributes address of type Address and contact of type Contact
    private Address address;
    private Contact contact ;


    public Passenger(Address address, Contact contact){
    this.address = address;
    this.contact = contact;
    this.idCounter = idCounter + 1;
 }
    public  int getPassengerCount()
    {
        return idCounter;
    }


    // Contact and Address classes nested inside the Passenger class

    private static class Address {

        private String street ;
        private String city;
        private String state;

        public Address(String street , String city, String state)
        {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return this.street;
        }

        public String getCity() {
            return this.city;
        }

        public String getState() {
            return this.state;
        }

        public void setStreet(String street)
        {
            this.street = street;
        }

        public void setCity(String city)
        {
            this.city = city;
        }

        public void setState(String state)
        {
            this.state = state;
        }

    }

    private static class Contact {

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

}
