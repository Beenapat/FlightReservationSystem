package com.company;
import java.util.Scanner;

public class Flight {
 String airline;
 int flightNo;
 int seats;
 int capacity;
 Scanner input = new Scanner(System.in);
 Ticket ticket = new Ticket();

 public  void bookMytrip()
 {
  System.out.println("Enter the departure");
  ticket.departure = input.nextLine();
  System.out.println("Enter the destination");
  ticket.destination = input.nextLine();

 }
}
