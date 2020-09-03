package com.flysaa.application;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Scanner;
import com.flysaa.flight.flightTicket;
import com.flysaa.people.Employee;
import com.flysaa.people.Person;
import com.flysaa.people.Customer;

public class Application{
public Application(){}

static int abc = 0;
public static void main(String [] args){

Scanner scan = new Scanner(System.in);

Employee  employees = new Employee();
Customer  customers = new Customer();
Customer customer = null;
LocalDate destinationDate = null;
LocalTime travelingTime = null;
LocalTime returnTime = null;
LocalDate returnDate = null;
ZonedDateTime returnTimeZone = null;

for(int a = 0; a < 5; a++){
System.out.println("** Welcome to SAA **");
System.out.println("Please select from the following option");
System.out.println("1.	Register Employee");
System.out.println("2.	Login");

int option = scan.nextInt();
if (option == 1){
Employee employee = new Employee();
scan.nextLine();
System.out.println("Please enter Name : ");
String name = scan.nextLine();
System.out.println("Please enter Surname : ");
String surname = scan.nextLine();
System.out.println("Please enter Gender : ");
String gender = scan.nextLine();
System.out.println("Please enter ID Number : ");
long idNumber = scan.nextLong();
System.out.println("Please Phone Number : ");
String phoneNumber = scan.nextLine();
scan.nextLine();
System.out.println("Please Email : ");
String email = scan.nextLine();
System.out.println("Please enter Employee ID NO : ");
int employeeIdNo = scan.nextInt();
System.out.println("Please enter Username : ");
scan.nextLine();
String username = scan.nextLine();
System.out.println("Please enter Password : ");
String password = scan.nextLine();
employee.register( name, surname, gender, idNumber, phoneNumber, email, employeeIdNo, username, password);
employees = employee;
abc++;
employee.display();
}

if (option == 2){
System.out.println("Login Details");
for(int b = 0; b<2; b++){
scan.nextLine();
System.out.println("Enter Username : ");
String username = scan.nextLine();
System.out.println("Enter Password : ");
String password = scan.nextLine();

for(int c = 0; c<2; c++){
if(username.equals(employees.getUsername()) && password.equals(employees.getPassword())){
System.out.println("Login Succesfull");
for(int d = 0; d<2; d++){
System.out.println("** Booking Flight **");
System.out.println("Choose an option : ");
System.out.println("1.  National Flight ");
System.out.println("2.  InterNational Flight ");
int elect = scan.nextInt();

if(elect == 1){
System.out.println("** National Flights **");
for(int e = 0; e<2; e++){
System.out.println("1.  Booking Single Flight ");
System.out.println("2.  Booking Return Flight ");
System.out.println("3.  Check In ");
System.out.println("4.  Cancallation ");
int choice = scan.nextInt();

if(choice == 1){
int zaq = 0;
flightTicket ticket = new flightTicket();
System.out.println(ticket);
customer = new Customer();
System.out.println("Enter your Name : ");
scan.nextLine();
String name = scan.nextLine();
System.out.println("Enter your Surname : ");
String surname = scan.nextLine();
System.out.println("Enter Gender : ");
String gender = scan.nextLine();
System.out.println("Enter ID Number : ");
long idNumber = scan.nextLong();
System.out.println("Enter Phone Number : ");
scan.nextLine();
String phoneNumber = scan.nextLine();
System.out.println("Enter Email : ");
String email = scan.nextLine();
System.out.println("Enter Destination From : ");
String destinationFrom = scan.nextLine();
System.out.println("Enter Destination To : ");
String destinationTo= scan.nextLine();
System.out.println("Enter year to leave :");
int year = scan.nextInt();
System.out.println("Enter month to leave :");
int month = scan.nextInt();
System.out.println("Enter day to leave :");
int day = scan.nextInt();
destinationDate = LocalDate.of(year, month, day);
System.out.println(destinationDate);
System.out.println("Enter Hour to leave : ");
int hour = scan.nextInt();
System.out.println("Enter Minutes to leave : ");
int minute = scan.nextInt();
System.out.println("Enter Seconds to leave : ");
int second = scan.nextInt();
travelingTime = LocalTime.of(hour, minute, second);
System.out.println(travelingTime);
System.out.println("Enter Seat Number : ");
String seatNumber = scan.nextLine();
System.out.println("continent");
String can = scan.nextLine();
System.out.println("city");
String city = scan.nextLine();
returnTimeZone = ZonedDateTime.of(returnDate, returnTime, ZoneId.of(can + "/" + city));


customer.bookingFlight(ticket, name, surname, gender, idNumber, phoneNumber, email, destinationFrom, destinationTo, destinationDate, travelingTime, seatNumber);
customers  = customer;
zaq++;
customer.displaySingle();
}

if (choice == 3){
System.out.println("Please present your ID Number : ");
long idNumber = scan.nextLong();
customer.checkIn(customers, idNumber);
}


if (choice == 4){
System.out.println("To cancel enter ID Number : ");
long idNumber = scan.nextLong();
customer.cancallation(customers, idNumber);
}else if (choice == 2){

int zaq = 0;
flightTicket ticket = new flightTicket();
System.out.println(ticket);
customer = new Customer();
System.out.println("Enter your Name : ");
scan.nextLine();
String name = scan.nextLine();
System.out.println("Enter your Surname : ");
String surname = scan.nextLine();
System.out.println("Enter Gender : ");
String gender = scan.nextLine();
System.out.println("Enter ID Number : ");
long idNumber = scan.nextLong();
System.out.println("Enter Phone Number : ");
scan.nextLine();
String phoneNumber = scan.nextLine();
System.out.println("Enter Email : ");
String email = scan.nextLine();
System.out.println("Enter Destination From : ");
String destinationFrom = scan.nextLine();
System.out.println("Enter Destination To : ");
String destinationTo= scan.nextLine();
System.out.println("Enter year to leave :");
int years = scan.nextInt();
System.out.println("Enter month to leave :");
int months = scan.nextInt();
System.out.println("Enter day to leave :");
int days = scan.nextInt();
destinationDate = LocalDate.of(years, months, days);
System.out.println(destinationDate);
System.out.println("Enter Hour to leave : ");
int hours = scan.nextInt();
System.out.println("Enter Minutes to leave : ");
int minutes = scan.nextInt();
System.out.println("Enter Seconds to leave : ");
int seconds = scan.nextInt();
travelingTime = LocalTime.of(hours, minutes, seconds);
System.out.println(travelingTime);
System.out.println("Enter Seat Number : ");
String seatNumber = scan.nextLine();
System.out.println("Will you be Returning: ");
String returnFlight = scan.nextLine();
System.out.println("Enter year to leave :");
int year = scan.nextInt();
System.out.println("Enter month to leave :");
int month = scan.nextInt();
System.out.println("Enter day to leave :");
int day = scan.nextInt();
destinationDate = LocalDate.of(year, month, day);
System.out.println(destinationDate);
System.out.println("Enter Hour to leave : ");
int hour2 = scan.nextInt();
System.out.println("Enter Minutes to leave : ");
int minute2 = scan.nextInt();
System.out.println("Enter Seconds to leave : ");
int second2 = scan.nextInt();
travelingTime = LocalTime.of(hour2, minute2, second2);
System.out.println(travelingTime);
System.out.println("Enter Return Seat Number : ");
String returnSeatNumber = scan.nextLine();

customer.bookingFlightReturn(ticket, name, surname, gender, idNumber, phoneNumber, email, destinationFrom, destinationTo, destinationDate, travelingTime, seatNumber, returnFlight, returnTime, returnDate, returnSeatNumber);
customers  = customer;
zaq++;
customer.displayReturn();
}
}
}

if(elect == 2){
System.out.println("** International Flights **");
for(int f = 0; f<2; f++){
System.out.println("Choose an option ");
System.out.println("1.  Booking Single Flight ");
System.out.println("2.  Booking Return Flight ");
System.out.println("2.  Check In ");
System.out.println("3.  Cancallation ");  
int alt = scan.nextInt();

if(alt == 1){
int zaq = 0;
flightTicket ticket = new flightTicket();
System.out.println(ticket);
customer = new Customer();
System.out.println("Enter your Name : ");
scan.nextLine();
String name = scan.nextLine();
System.out.println("Enter your Surname : ");
String surname = scan.nextLine();
System.out.println("Enter Gender : ");
String gender = scan.nextLine();
System.out.println("Enter ID Number : ");
long idNumber = scan.nextLong();
System.out.println("Enter Phone Number : ");
scan.nextLine();
String phoneNumber = scan.nextLine();
System.out.println("Enter Email : ");
String email = scan.nextLine();
System.out.println("Enter Destination From : ");
String destinationFrom = scan.nextLine();
System.out.println("Enter Destination To : ");
String destinationTo= scan.nextLine();
System.out.println("Enter year to leave :");
int yr = scan.nextInt();
System.out.println("Enter month to leave :");
int mth = scan.nextInt();
System.out.println("Enter day to leave :");
int dy = scan.nextInt();
destinationDate = LocalDate.of(yr, mth, dy);
System.out.println(destinationDate);
System.out.println("Enter Hour to leave : ");
int hr = scan.nextInt();
System.out.println("Enter Minutes to leave : ");
int min = scan.nextInt();
System.out.println("Enter Seconds to leave : ");
int sec = scan.nextInt();
travelingTime = LocalTime.of(hr, min, sec);
System.out.println(travelingTime);
System.out.println("Enter Seat Number : ");
String seatNumber = scan.nextLine();

customer.bookingFlightInter(ticket, name, surname, gender, idNumber, phoneNumber, email, destinationFrom, destinationTo, destinationDate, travelingTime, seatNumber);
customers  = customer;
zaq++;
customer.displaySingleInter();
}

if(alt == 2){

int zaq = 0;
flightTicket ticket = new flightTicket();
System.out.println(ticket);
customer = new Customer();
System.out.println("Enter your Name : ");
scan.nextLine();
String name = scan.nextLine();
System.out.println("Enter your Surname : ");
String surname = scan.nextLine();
System.out.println("Enter Gender : ");
String gender = scan.nextLine();
System.out.println("Enter ID Number : ");
long idNumber = scan.nextLong();
System.out.println("Enter Phone Number : ");
scan.nextLine();
String phoneNumber = scan.nextLine();
System.out.println("Enter Email : ");
String email = scan.nextLine();
System.out.println("Enter Destination From : ");
String destinationFrom = scan.nextLine();
System.out.println("Enter Destination To : ");
String destinationTo= scan.nextLine();
System.out.print("Enter year to leave :");
int yrs = scan.nextInt();
System.out.print("Enter month to leave :");
int mths = scan.nextInt();
System.out.print("Enter day to leave :");
int dys = scan.nextInt();
destinationDate = LocalDate.of(yrs, mths, dys);
System.out.println(destinationDate);
System.out.println("Enter Hour to leave : ");
int hrs = scan.nextInt();
System.out.println("Enter Minutes to leave : ");
int mins = scan.nextInt();
System.out.println("Enter Seconds to leave : ");
int secs = scan.nextInt();
travelingTime = LocalTime.of(hrs, mins, secs);
System.out.println(travelingTime);
System.out.println("Enter Seat Number : ");
String seatNumber = scan.nextLine();
System.out.println("Will you be Returning: ");
String returnFlight = scan.nextLine();
System.out.print("Enter year to leave :");
int year = scan.nextInt();
System.out.print("Enter month to leave :");
int month = scan.nextInt();
System.out.print("Enter day to leave :");
int day = scan.nextInt();
returnDate = LocalDate.of(year, month, day);
System.out.println(returnDate);
System.out.println("Enter Hour to leave : ");
int hour = scan.nextInt();
System.out.println("Enter Minutes to leave : ");
int minutes = scan.nextInt();
System.out.println("Enter Seconds to leave : ");
int seconds = scan.nextInt();
returnTime = LocalTime.of(hour, minutes, seconds);
System.out.println(returnTime);
System.out.println("Enter Return Seat Number : ");
String returnSeatNumber = scan.nextLine();

customer.bookingFlightReturnInter(ticket, name, surname, gender, idNumber, phoneNumber, email, destinationFrom, destinationTo, destinationDate, travelingTime, seatNumber, returnFlight, returnTime, returnDate, returnSeatNumber);
customers  = customer;
zaq++;
customer.displayReturnInter();
}

if(alt == 3){
System.out.println("Please enter your ID Number : ");
long idNumber = scan.nextLong();
customer.checkInInter(customers, idNumber);
}

if(alt == 4){
System.out.println("To cancel enter ID Number : ");
long idNumber = scan.nextLong();
customer.cancallationInter(customers, idNumber);
}

}

}
}
}else {System.out.println("PLEASE TRY AGAIN : PRESS ENTER");
}
}
}
}
}
}
}
