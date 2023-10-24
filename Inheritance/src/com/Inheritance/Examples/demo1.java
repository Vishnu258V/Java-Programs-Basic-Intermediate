package com.Inheritance.Examples;


class Address {
   
	private String streetName;
    private String city;
    private String state;
    private int pincode;
   
	    public String getStreetName() {
	        return streetName;
	    }
	    public void setStreetName(String streetName) {
	        this.streetName = streetName;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public int getPincode() {
	        return pincode;
	    }
	    public void setPincode(int pincode) {
	        this.pincode = pincode;
	    }
    
}

class User {
   
	private String firstName;
    private String lastName;
    private String email;
    private Address address;
  
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public Address getAddress() {
	        return address;
	    }
	    public void setAddress(Address address) {
	        this.address = address;
	    }
}


public class demo1 {
    
    public static void main(String[] args) {
        User user = new User();
        Address addres = new Address();
        
        addres.setStreetName("ABC");
        addres.setCity("Hyd");
        addres.setState("TS");
        addres.setPincode(502032);
       
        user.setFirstName("Anji");
        user.setLastName("A");
        user.setEmail("test@gmail.com");
        user.setAddress(addres);
       
        System.out.println(user.getEmail());
        System.out.println(user.getAddress().getPincode());
    
        
    }   
}
