package com.flysaa.flight;

public class FlightTicket{
public FlightTicket(){}


private String destinationFrom;
private String destinationTo;
private String destinationDate;
private String travelingTime;
private String seatNumber;
private String returnFlight;
private String returnTime;
private String returnDate;
private String returnSeatNumber;

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


public String getDestinationDate(){
return destinationDate;
}
public void setDestinationDate(String destinationDate){
this.destinationDate = destinationDate;
}

public String getTravelingTime(){
return travelingTime;
}
public void setTravelingTime(String travelingTime){
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

public String getReturnTime(){
return returnTime;
}
public void setReturnTime(String returnTime){
this.returnTime = returnTime;
}

public String getReturnDate(){
return returnDate;
}
public void setReturnDate(String returnDate){
this.returnDate = returnDate;
}

public String getReturnSeatNumber(){
return returnSeatNumber;
}
public void setReturnSeatNumber(String returnSeatNumber){
this.returnSeatNumber = returnSeatNumber;
}


}
