package ui;

import java.time.LocalDate;

import com.util.Console;

import business.Reservation;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Reservation Calculator");
		System.out.println();
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter arrival and departure info: ");
			System.out.println("==================================");
			
			int arrMonth=Console.getInt("Enter the arrival month (mm): ", 0, 13);
			int arrDay=Console.getInt("Enter the arrival day (dd): ", 0, 31);
			int year=Console.getInt("Enter the arrival year (yyyy): ");
			System.out.println();
			
			int depMonth=Console.getInt("Enter the departure month (mm): ", 0, 13);
			int depDay=Console.getInt("Enter the departure day (dd): ", 0, 31);
			int depYear=Console.getInt("Enter the departure year (yyyy): ");
			System.out.println();
			
			LocalDate arrivalDate=LocalDate.of(year, arrMonth, arrDay);
			LocalDate departureDate=LocalDate.of(depYear, depMonth, depDay);
			
			Reservation res=new Reservation(arrivalDate, departureDate);
			
			System.out.println("Arrival Date: "+res.getArrivalDateFormatted());
			System.out.println("Departure Date: "+res.getDepartureDateFormatted());
			System.out.println("Price per Night: "+res.pricePerNightFormatted());
			System.out.println("Total Price: "+res.getToalPriceFormatted());
			
			choice=Console.getString("Continue? y/n", "y", "n");
			System.out.println();
		}
		
		System.out.println("Peace");

	}

}
