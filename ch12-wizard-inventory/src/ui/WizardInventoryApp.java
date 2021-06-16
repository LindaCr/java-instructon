package ui;

import java.util.ArrayList;
import java.util.List;

import com.util.Console;

public class WizardInventoryApp {
	
	static List<String> items;
	
	public static void main(String[] args) {
		
		items= new ArrayList<>();
		items.add("wooden staff");
		items.add("wizard hat");
		items.add("cloth shoes");
		
		System.out.println("Welcome to the Wizard Inventory Game");
		System.out.println();
		
		String command="";
		while (!command.equalsIgnoreCase("exit")) {
			displayMenu();
			command=Console.getString("Command: ");
			switch (command) {
			case "show":
				System.out.println("List all items: ");
				System.out.println("================");
				listItems();
				break;
			case "grab":
				System.out.println("Add an item: ");
				System.out.println("================");
				addItem();
				break;
			case "edit":
				System.out.println("Edit an item: ");
				System.out.println("================");
				int itemNbr=Console.getInt("Number: ");
				editNumber(itemNbr);
				break;
			case "drop":
				System.out.println("Drop an item: ");
				System.out.println("================");
				itemNbr=Console.getInt("Number: ");
				dropItem(itemNbr);
				break;
			case "exit":
				//leave program
				break;
			default:
				System.out.println("Invalid Command. Try Again");
				break;
			}
			
			System.out.println();
		}
	
		System.out.println("Peace");

	}

	private static void dropItem(int itemNbr) {
		if (validateItemNumber(itemNbr)) {
			String deletedItem=items.remove(itemNbr-1);
			System.out.println(deletedItem+" was dropped.");	
		}else {
			System.out.println("Invalid item number.");
		}
	}

	private static void editNumber(int itemNbr) {
		if (validateItemNumber(itemNbr)) {
			String name=Console.getLine("Updated name: ");
			items.set(itemNbr-1, name);
			System.out.println("Item number "+itemNbr+" was updated.");
		}else {
			System.out.println("Invalid item number.");
		}
	}

	private static void displayMenu() {
		System.out.println("Command Menu: ");
		System.out.println("======================");
		System.out.println("show- show all items");
		System.out.println("grab- grab an item");
		System.out.println("edit- edit an item");
		System.out.println("drop- drop an item");
		System.out.println("exit- exit program");
		System.out.println();
	}
	
	private static void listItems() {
		for (int i=0; i<items.size(); i++) {
			System.out.println((i+1)+" . "+items.get(i));
		}
	}
	
	private static void addItem() {
		if (items.size()<4) {
			String name=Console.getLine("Name: ");
			items.add(name);
			System.out.println(name+ " was added.");
			
		}else {
			System.out.println("You can't carry more items. Drop something first.");
		}
	}
	private static boolean validateItemNumber(int itemNbr) {
		boolean found=false;
		if (itemNbr>0 && itemNbr<=items.size()) {
			found=true;
		}
		
		return found;
	}
	
}
