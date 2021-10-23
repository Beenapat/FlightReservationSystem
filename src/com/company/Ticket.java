package com.company;

 public abstract class Ticket {
     //all the attribute made private
    private int price;
    private String departure;
    private  String destination;
    private  String departureTime;
    private String departureDate;
    private String arrivalTime;
    private  String arrivalDate;
    private  int seatNo;
    private int PNRNo;
    private Flight flight;

   public Ticket(int price,String departure,   String destination,   String departureTime,String departureDate,String arrivalTime,String arrivalDate,int seatNo,int PNRNo)
   {

       this.price = price;
       this.departure = departure;
       this.destination = destination;
       this.departureTime = departureTime;
       this.departureDate = departureDate;
       this.arrivalDate = arrivalDate;
       this.arrivalTime = arrivalTime;
       this.seatNo = seatNo;
       this.PNRNo = PNRNo;
   }

    public int getPrice() {
        return price;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public int getPNRNo() {
        return PNRNo;
    }

    public Ticket(Flight flight,Passenger passenger)

    {


    }

}
