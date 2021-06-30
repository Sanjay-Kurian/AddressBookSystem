package com.bridgelabz.addressbook;

public class AddressBook {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phone;
	String email;
	@Override
	public String toString() {
		return "AddressBook [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
}
