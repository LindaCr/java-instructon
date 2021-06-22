package ui;

import com.util.Console;

import business.Item;
import db.ItemDB;
import interfaces.DAO;
import text.ItemTextFile;

public class ItemManagerApp {
	private static final String ITEM_NOT_FOUND= "No item found for id: ";
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to the Item Manager- Text file version");

		//creating instance of of itemtextfile should create file
		DAO<Item> itemsDAO= new ItemDB();
		
		int command=0;
		while (command!=9) {
			displayMenu();
			command=Console.getInt("Command");
			System.out.println();
			
			switch (command) {
			case 1:
				//get all
				System.out.println("Get all items");
				System.out.println("=================");
				for (Item item: itemsDAO.getAll()) {
					System.out.println(item);
				}
				break;
			case 2:
				//get item
				System.out.println("Get an Item");
				System.out.println("================");
				int id=Console.getInt("ID: ");
				Item item= itemsDAO.get(id);
				if (item!=null) {
					System.out.println("Item found: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 3:
				//add
				System.out.println("Add an item: ");
				System.out.println("==================");
			   // id=Console.getInt("ID: "); with a database, we don't set the id
				String desc=Console.getLine("Description: ");
				if    (itemsDAO.add(new Item(desc))) {
					System.out.println("Item added!");
				}
				else {
					System.out.println("Error adding item.");
				}
				break;
			case 4:
				//update
				System.out.println("Update an item: ");
				System.out.println("==================");
				id=Console.getInt("ID: ");
				item= itemsDAO.get(id);
				if (item!=null) {
					String newDesc=Console.getLine("New Description: ");
					item.setDescription(newDesc);
					itemsDAO.update(item);
					System.out.println("Item updated!");
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 5:
				//delete
				System.out.println("Delete an item:  ");
				System.out.println("===================");
				id=Console.getInt("ID: ");
				item= itemsDAO.get(id);
				if (item!=null) {
					itemsDAO.delete(item);
					System.out.println("Item deleted: "+item);
				}
				else {
					System.out.println(ITEM_NOT_FOUND+ id);
				}
				break;
			case 9:
				//exit
				break;
			default:	
				System.out.println("Invalid command! Try again.");
				break;
			}
			
			
			
			
		}
		
		
		
		System.out.println("Peace");
	}

	private static void displayMenu() {
		System.out.println("Command menu");
		System.out.println("=================");
		System.out.println("1- Get all items");
		System.out.println("2- Get an item");
		System.out.println("3- Add an item");
		System.out.println("4- Update an item");
		System.out.println("5- Delete an item");
		System.out.println("9- exit");
		System.out.println();
	}
	
}
