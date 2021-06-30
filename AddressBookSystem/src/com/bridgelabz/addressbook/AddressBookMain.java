package com.bridgelabz.addressbook;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		AddressBook contact = new AddressBook();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First name");
		String first = scanner.next();
		contact.firstName = first;
		System.out.println("Enter last name");
		String last = scanner.next();
		contact.lastName = last;
		System.out.println("Enter address (put underscore instead of spaces)");
		String address = scanner.next();
		contact.address = address;
		System.out.println("Enter city");
		String city = scanner.next();
		contact.city = city;
		System.out.println("Enter state");
		String state = scanner.next();
		contact.state = state;
		System.out.println("Enter pin code");
		int zip = scanner.nextInt();
		contact.zip = zip;
		System.out.println("Enter phone number");
		long phone = scanner.nextLong();
		contact.phone = phone;
		System.out.println("Enter email ID");
		String email = scanner.next();
		contact.email = email;
		
		AddressOperations addressOperations = new AddressOperations();
		addressOperations.add(contact);
		addressOperations.display();
	}
}
