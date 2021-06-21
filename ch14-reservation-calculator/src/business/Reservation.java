package business;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	private LocalDate arrivalDate;
	private LocalDate departureDate;
	public static final double PRICE_PER_NIGHT=145.0;
	private DateTimeFormatter dateTimeFormat=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
	private NumberFormat currencyFormat=NumberFormat.getCurrencyInstance();
	
	
	public Reservation() {
		super();
	}


	public Reservation(LocalDate arrivalDate, LocalDate departureDate) {
		super();
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
	}


	public LocalDate getArrivalDate() {
		return arrivalDate;
	}


	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}


	public LocalDate getDepartureDate() {
		return departureDate;
	}


	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}


	@Override
	public String toString() {
		return "Reservation [arrivalDate=" + arrivalDate + ", departureDate=" + departureDate + ", PRICE_PER_NIGHT="
				+ PRICE_PER_NIGHT + "]";
	}
	
	
	public String getArrivalDateFormatted() {
		return dateTimeFormat.format(arrivalDate);
	}
	
	public String getDepartureDateFormatted() {
		return dateTimeFormat.format(departureDate);
	}
	
	public int getNumberOfNights() {
		return (int) ChronoUnit.DAYS.between(arrivalDate, departureDate);
	}
	
	public String pricePerNightFormatted() {
		return currencyFormat.format(PRICE_PER_NIGHT);
	}
	
	public double getTotalPrice() {
		return PRICE_PER_NIGHT *getNumberOfNights();
	}
	
	public String getToalPriceFormatted () {
		return currencyFormat.format(getTotalPrice());
	}
}
