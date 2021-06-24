package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import business.Contact;
import interfaces.TestContact;

public class LambdasPredicateApp {

	public static void main(String[] args) {
		System.out.println("Welcome to Lambdas Predicates");

		List<Contact> contacts= new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		System.out.println("All Contacts: ");
		for (Contact c:contacts) {
			System.out.println(c);
		}

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
										Predicate<Contact> condition) {
		List<Contact> filteredContacts= new ArrayList<>();
		for (Contact c: contacts) {
			if (condition.test(c)) {
				filteredContacts.add(c);
			}
		}
		return filteredContacts;
	}
	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c:contacts) {
			System.out.println(c);
		}
	}
}	
