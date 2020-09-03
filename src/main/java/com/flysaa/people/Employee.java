package com.flysaa.people;

public class Employee extends Person{
public Employee(){}

private int employeeIdNo;
private String username;
private String password;

public int getEmployeeIdNo(){
return employeeIdNo;
}
public void setEmployeeIdNo(int employeeIdNo){
this.employeeIdNo = employeeIdNo;
}

public String getUsername(){
return username;
}
public void setUsername(String username){
this.username = username;
}

public String getPassword(){
return password;
}
public void setPassword(String password){
this.password = password;
}

public void register(String name, String surname, String gender, long idNumber, String phoneNumber, String email, int employeeIdNo, String username, String password){
this.setName(name);
this.setSurname(surname);
this.setGender(gender); 
this.setIdNumber(idNumber);
this.setPhoneNumber(phoneNumber);
this.setEmail(email);
this.setEmployeeIdNo(employeeIdNo);
this.setUsername(username);
this.setPassword(password);
}

public void display(){
System.out.println("Employee Details");
System.out.println("Name : " + getName());
System.out.println("Surname : " + getSurname());
System.out.println("Gender : " + getGender());
System.out.println("ID Number : " + getIdNumber());
System.out.println("Phone Number : " + getPhoneNumber());
System.out.println("Email : " + getEmail());
System.out.println("Employee ID NO : " + getEmployeeIdNo());
System.out.println("Username : " + getUsername());
System.out.println("Password : " + getPassword());
}

}
