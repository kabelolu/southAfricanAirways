package com.flysaa.people;

import com.flysaa.flight.flightTicket;
import com.flysaa.application.Application;
import java.time.ZoneId;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Customer extends Person{
public Customer(){}


private String nextOfKin;
public flightTicket ticket;

public String getNextOfKin(){
return nextOfKin;
}
public void setNextOfKin(String nextOfKin){
this.nextOfKin = nextOfKin;
}

public void bookingFlight(flightTicket ticket, String name, String surname, String gender, long idNumber, String phoneNumber, String email, String destinationFrom, String destinationTo, LocalDate destinationDate, LocalTime travelingTime, String seatNumber){
this.ticket = ticket;
this.setName(name);
this.setSurname(surname);
this.setGender(gender);
this.setIdNumber(idNumber);
this.setPhoneNumber(phoneNumber);
this.setEmail(email);
ticket.setDestinationFrom(destinationFrom);
ticket.setDestinationTo(destinationTo);
ticket.setDestinationDate(destinationDate);
ticket.setTravelingTime(travelingTime);
ticket.setSeatNumber(seatNumber);
}

public void displaySingle(){
System.out.println("National Single Ticket ");
System.out.println("Name         : " + getName() + "   From : " + ticket.getDestinationFrom());
System.out.println("Surname      : " + getSurname() + "   To   : "	+ ticket.getDestinationTo());
System.out.println("Gender       : " + getGender() + "   Date : " +  ticket.getDestinationDate());
System.out.println("ID Number    : " + getIdNumber() + "   Time : " + ticket.getTravelingTime());
System.out.println("Phone Number : " + getPhoneNumber());
System.out.println("Email        : " + getEmail());
System.out.println("Seat Number  : " + ticket.getSeatNumber());
System.out.println("Derpature day : " + ticket.getDestinationDate());
System.out.println("Take of time : " + ticket.getTravelingTime()); 
}

public void bookingFlightReturn(flightTicket ticket, String name, String surname, String gender, long idNumber, String phoneNumber, String email, String destinationFrom, String destinationTo, LocalDate destinationDate, LocalTime travelingTime, String seatNumber, String returnFlight,  LocalTime returnTime, LocalDate returnDate, String returnSeatNumber){
this.ticket = ticket;
this.setName(name);
this.setSurname(surname);
this.setGender(gender);
this.setIdNumber(idNumber);
this.setPhoneNumber(phoneNumber);
this.setEmail(email);
ticket.setDestinationFrom(destinationFrom);
ticket.setDestinationTo(destinationTo);
ticket.setDestinationDate(destinationDate);
ticket.setTravelingTime(travelingTime);
ticket.setSeatNumber(seatNumber);
ticket.setReturnFlight(returnFlight);
ticket.setReturnTime(returnTime);
ticket.setReturnDate(returnDate);
ticket.setReturnSeatNumber(returnSeatNumber);
}

public void displayReturn(){
System.out.println("National Return Ticket ");
System.out.println("Name        : " + getName() + "   From: " + ticket.getDestinationFrom());
System.out.println("Surname     : " + getSurname() + "   To: "	+ ticket.getDestinationTo());
System.out.println("Gender      : " + getGender() + "   Date : " +  ticket.getDestinationDate());
System.out.println("ID Number   : " + getIdNumber() + "   Time : " + ticket.getTravelingTime());
System.out.println("Phone Number: " + getPhoneNumber() + "   Seat Number : " + ticket.getSeatNumber());
System.out.println("Email       : " + getEmail());
System.out.println("Return Flight : " + ticket.getReturnFlight());
System.out.println("Return Time : " + ticket.getReturnTime());
System.out.println("Return Date : " + ticket.getReturnDate());
System.out.println("Return Seat Number : " + ticket.getReturnSeatNumber());
System.out.println("Time Stamp : " + ZonedDateTime.now());
}

public void checkIn(Customer  customers, long idNumber){
for(int g = 0; g<2; g++){
if(idNumber == customers.getIdNumber()){
System.out.println("Proceed to check in. ");
break;
} else {
System.out.println("Wait for futher assistance. ");
}
}
}

public void cancallation(Customer  customers, long idNumber){
for(int h = 0; h<1; h++){
if(idNumber == customers.getIdNumber()){
System.out.println("Cancalation Complete");
break;
} else{
System.out.println("Incorrect ID Number: Try Again ");
}
}
}

public void bookingFlightInter(flightTicket ticket, String name, String surname, String gender, long idNumber, String phoneNumber, String email, String destinationFrom, String destinationTo, LocalDate destinationDate, LocalTime travelingTime, String seatNumber){
this.ticket = ticket;
this.setName(name);
this.setSurname(surname);
this.setGender(gender);
this.setIdNumber(idNumber);
this.setPhoneNumber(phoneNumber);
this.setEmail(email);
ticket.setDestinationFrom(destinationFrom);
ticket.setDestinationTo(destinationTo);
ticket.setDestinationDate(destinationDate);
ticket.setTravelingTime(travelingTime);
ticket.setSeatNumber(seatNumber);
}

public void displaySingleInter(){
System.out.println("InterNational Single Ticket ");
System.out.println("Name         : " + getName() + "   From : " + ticket.getDestinationFrom());
System.out.println("Surname      : " + getSurname() + "   To   : "	+ ticket.getDestinationTo());
System.out.println("Gender       : " + getGender() + "   Date : " +  ticket.getDestinationDate());
System.out.println("ID Number    : " + getIdNumber() + "   Time : " + ticket.getTravelingTime());
System.out.println("Phone Number : " + getPhoneNumber());
System.out.println("Email        : " + getEmail());
System.out.println("Seat Number  : " + ticket.getSeatNumber());
}

public void bookingFlightReturnInter(flightTicket ticket, String name, String surname, String gender, long idNumber, String phoneNumber, String email, String destinationFrom, String destinationTo, LocalDate destinationDate, LocalTime travelingTime, String seatNumber, String returnFlight,  LocalTime returnTime, LocalDate returnDate, String returnSeatNumber){
this.ticket = ticket;
this.setName(name);
this.setSurname(surname);
this.setGender(gender);
this.setIdNumber(idNumber);
this.setPhoneNumber(phoneNumber);
this.setEmail(email);
ticket.setDestinationFrom(destinationFrom);
ticket.setDestinationTo(destinationTo);
ticket.setDestinationDate(destinationDate);
ticket.setTravelingTime(travelingTime);
ticket.setSeatNumber(seatNumber);
ticket.setReturnFlight(returnFlight);
ticket.setReturnTime(returnTime);
ticket.setReturnDate(returnDate);
ticket.setReturnSeatNumber(returnSeatNumber);
}

public void displayReturnInter(){
System.out.println("InterNational Return Ticket ");
System.out.println("Name        : " + getName() + "   From: " + ticket.getDestinationFrom());
System.out.println("Surname     : " + getSurname() + "   To: "	+ ticket.getDestinationTo());
System.out.println("Gender      : " + getGender() + "   Date : " +  ticket.getDestinationDate());
System.out.println("ID Number   : " + getIdNumber() + "   Time : " + ticket.getTravelingTime());
System.out.println("Phone Number: " + getPhoneNumber() + "   Seat Number : " + ticket.getSeatNumber());
System.out.println("Email       : " + getEmail());
System.out.println("Return Flight : " + ticket.getReturnFlight());
System.out.println("Return Time : " + ticket.getReturnTime());
System.out.println("Return Date : " + ticket.getReturnDate());
System.out.println("Return Seat Number : " + ticket.getReturnSeatNumber());
}


public void checkInInter(Customer  customers, long idNumber){
for(int i = 0; i<2; i++){
if(idNumber == customers.getIdNumber()){
System.out.println("Proceed to check in. ");
break;
} else {
System.out.println("Wait for futher assistance. ");
}
}
}

public void cancallationInter(Customer  customers, long idNumber){
for(int j = 0; j<1; j++){
if(idNumber == customers.getIdNumber()){
System.out.println("Cancalation Complete");
break;
} else{
System.out.println("Incorrect ID Number: Try Again ");
}
}
}


}
