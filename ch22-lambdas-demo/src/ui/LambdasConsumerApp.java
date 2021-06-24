package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import business.Contact;
import interfaces.TestContact;

public class LambdasConsumerApp {

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
		System.out.println("Print the names of contacts: ");
		processContacts(contacts, c-> System.out.println(c.getName()));
		
		System.out.println("========================================");
		System.out.println("Change names to uppercase: ");
		processContacts(contacts, c-> c.setName(c.getName().toUpperCase()));
		processContacts(contacts, c-> System.out.println(c.getName()));
		
		
		System.out.println();
		System.out.println("Peace");
	}

	public static void processContacts(List<Contact> contacts, Consumer<Contact> consumer) {
		for (Contact c:contacts) {
			consumer.accept(c);
		}
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
