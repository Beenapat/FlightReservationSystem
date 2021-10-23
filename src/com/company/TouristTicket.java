package com.company;

//Inheritance relationship between Ticket class and TouristTicket class
    public class TouristTicket extends Ticket{
    private String hotelAddress;

    private  String [] places = { };

    public String[] getPlaces() {
        return places;
    }

    public void setPlaces(String[] places)
    {
        this.places = places;
    }
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    public TouristTicket(String hotelAddress, int price,String departure,   String destination,   String departureTime,String departureDate,String arrivalTime,String arrivalDate,int seatNo,int PNRNo)
   {

       //Ticket constructor will be called from the constructor of the TouristTicket class using the super() keyword

       super(price, departure,    destination,    departureTime, departureDate, arrivalTime, arrivalDate, seatNo, PNRNo);
       this.hotelAddress = hotelAddress;
   }
}
