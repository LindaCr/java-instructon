package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;
import interfaces.TestContact;

public class LambdasApp {

	public static void main(String[] args) {
		System.out.println("Welcome to lambdas");

		List<Contact> contacts= new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts: ");
		for (Contact c:contacts) {
			System.out.println(c);
		}
		System.out.println("========================================");
		System.out.println("Contacts no phone- no lambda");
		List<Contact> contactsNoPhone=filterContactsNoPhone(contacts);
		printContacts(contactsNoPhone);
		
		
		System.out.println("========================================");
		System.out.println("Contacts no email- no lambda");
		List<Contact> contactsNoEmail=filterContactsNoEmail(contacts);
		printContacts(contactsNoEmail);
		
		System.out.println("========================================");
		System.out.println("Contacts no email and no phone- no lambda");
		List<Contact> contactsNoEmailNoPhone=filterContactsNoEmailNoPhone(contacts);
		printContacts(contactsNoEmailNoPhone);
		
		System.out.println("========================================");
		System.out.println("Contacts no phone w lambda");
		List<Contact> contactsNoPhone1=filterContacts(contacts, c -> c.getPhone()==null);
		printContacts(contactsNoPhone1);
		
		System.out.println("========================================");
		System.out.println("Contacts no email with lambda");
		List<Contact> contactsNoEmail1=filterContacts(contacts, c -> c.getEmail()==null);
		printContacts(contactsNoEmail1);
		
		System.out.println("========================================");
		System.out.println("Contacts no email and no phone with lambda");
		List<Contact> contactsNoEmailNoPhone1=filterContacts(contacts, c -> c.getPhone()==null && c.getEmail()==null);
		printContacts(contactsNoEmailNoPhone1);
		
		
		
		System.out.println();
		System.out.println("Peace");
	}

	//our lambda method
	public static List<Contact> filterContacts(List<Contact> contacts,
										TestContact condition) {
		List<Contact> filteredContacts= new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	
	//below methods do not use lambdas
	public static void printContacts(List<Contact> contacts) {
		for (Contact c:contacts) {
			System.out.println(c);
		}
	}
	
	
	public static List<Contact> filterContactsNoPhone(List<Contact> contacts) {
		List<Contact> contactsNoPhone= new ArrayList<>();
		for (Contact c:contacts) {
			if (c.getPhone()==null) {
				contactsNoPhone.add(c);
			}
		}
		return contactsNoPhone;
	}
	
	public static List<Contact> filterContactsNoEmail(List<Contact> contacts) {
		List<Contact> contactsNoEmail= new ArrayList<>();
		for (Contact c:contacts) {
			if (c.getEmail()==null) {
				contactsNoEmail.add(c);
			}
		}
		return contactsNoEmail;
	}
	
	public static List<Contact> filterContactsNoEmailNoPhone(List<Contact> contacts) {
		List<Contact> contactsNoEmailNoPhone= new ArrayList<>();
		for (Contact c:contacts) {
			if (c.getEmail()==null && c.getPhone()==null) {
				contactsNoEmailNoPhone.add(c);
			}
		}
		return contactsNoEmailNoPhone;
	}
	
}
