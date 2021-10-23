package com.company;

//Inheritance relationship between Ticket class and RegularTicket class
public class RegularTicket extends Ticket {
    private String services;
    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }
    public RegularTicket(String services, int price,String departure,   String destination,   String departureTime,String departureDate,String arrivalTime,String arrivalDate,int seatNo,int PNRNo)

    {
        //Ticket constructor will be called from the constructor of the RegularTicket class

        super(price, departure,    destination,    departureTime, departureDate, arrivalTime, arrivalDate, seatNo, PNRNo);
        this.services = services;
    }

}
