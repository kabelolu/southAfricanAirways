package com.flysaa.flight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class flightTicket{
public flightTicket(){}

private String destinationFrom;
private String destinationTo;
private LocalDate destinationDate;
private LocalTime travelingTime;
private String seatNumber;
private String returnFlight;
private LocalTime returnTime;
private LocalDate returnDate;
private String returnSeatNumber;
private  ZonedDateTime returnTimeZone;


public String getDestinationFrom(){
return destinationFrom;
}
public void setDestinationFrom(String destinationFrom){
this.destinationFrom = destinationFrom;
}

public String getDestinationTo(){
return destinationTo;
}
public void setDestinationTo(String destinationTo){
this.destinationTo = destinationTo;
}

public LocalDate getDestinationDate(){
return destinationDate;
}
public void setDestinationDate(LocalDate destinationDate){
this.destinationDate = destinationDate;
}

public LocalTime getTravelingTime(){
return travelingTime;
}
public void setTravelingTime(LocalTime travelingTime){
this.travelingTime = travelingTime;
}

public String getSeatNumber(){
return seatNumber;
}
public void setSeatNumber(String seatNumber){
this.seatNumber = seatNumber;
}

public String getReturnFlight(){
return returnFlight;
}
public void setReturnFlight(String returnFlight){
this.returnFlight = returnFlight;
}

public LocalTime getReturnTime(){
return returnTime;
}
public void setReturnTime(LocalTime returnTime){
this.returnTime = returnTime;
}

public LocalDate getReturnDate(){
return returnDate;
}
public void setReturnDate(LocalDate returnDate){
this.returnDate = returnDate;
}

public String getReturnSeatNumber(){
return returnSeatNumber;
}
public void setReturnSeatNumber(String returnSeatNumber){
this.returnSeatNumber = returnSeatNumber;
}

public ZonedDateTime getReturnTimeZone(){
return returnTimeZone;
}
public void setReturnTimeZone(ZonedDateTime returnTimeZone){
this.returnTimeZone = returnTimeZone;
}

}
