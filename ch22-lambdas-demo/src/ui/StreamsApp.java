package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import business.Contact;
import interfaces.TestContact;

public class StreamsApp {

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
		System.out.println("Print names of contacts with no phone stream");
		contacts.stream()
			.filter(c -> c.getPhone()==null)
			.forEach(c -> System.out.println(c.getName()));
		
		
		System.out.println("========================================");
		System.out.println("Create list of new contacts with no phone stream");
		List<Contact> contactsNoPhone=contacts.stream()
				.filter(c -> c.getPhone()==null)
				.collect(Collectors.toList());
		printContacts(contactsNoPhone);
		
		//p 719
		System.out.println("=============================");
		List<String> contactNames= contacts.stream()
				.map(c -> c.getName())
				.collect(Collectors.toList());
		contactNames.stream().forEach(str -> System.out.println(str));
		
		//double colon version
		System.out.println("==========================");
		contactNames=contacts.stream().map(Contact::getName).collect(Collectors.toList());
		contactNames.stream().forEach(System.out::println);
		
		
		
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
	
	public static void printContacts(List<Contact> contacts) {
		for (Contact c:contacts) {
			System.out.println(c);
		}
	}
	
}	
	