package com.company;

public class Main {


    public static void main(String[] args) {


        RegularTicket regularTicket = new RegularTicket("lunch", 2500, "Mumbai", "Banglore", "9:00 AM", "22 OCT 2021", "10:30 AM", "22 OCT 2021", 10, 5678);
        TouristTicket touristTicket = new TouristTicket("VIVANTA HOTEL Banglore", 3500, "Mumbai", "Banglore", "9:00 AM", "22 OCT 2021", "10:30 AM", "22 OCT 2021", 10, 2456);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket) {
        int a = ticket.getPNRNo();

        System.out.println(a);

    }
}

