package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressOperations {
	List<AddressBook> addressList = new ArrayList<AddressBook>();
	
	void add(AddressBook contact) {
		addressList.add(contact);
	}
	
	void display() {
		for(AddressBook element: addressList) {
			System.out.println(element);
		}
	}
}
