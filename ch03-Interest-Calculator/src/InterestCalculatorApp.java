import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		System.out.println();

		Scanner sc= new Scanner(System.in);
		
		String choice= "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter loan amount: ");
			BigDecimal loanAmt=sc.nextBigDecimal();
			System.out.print("Enter interest amount: ");
			BigDecimal intRate=sc.nextBigDecimal();
			
			BigDecimal interest=loanAmt.multiply(intRate).
					setScale(2, RoundingMode.HALF_UP);
			
			//or BigDecimal interest=loanAmt.multiply(intRate);
			//interest=interest.setScale(2, RoundingMode.HALF_UP);
			
			NumberFormat currency=NumberFormat.getCurrencyInstance();
			NumberFormat pct=NumberFormat.getPercentInstance();
			pct.setMaximumFractionDigits(3);
			
			
			System.out.println("Loan Amount: "+currency.format(loanAmt));
			System.out.println("Interest Rate: "+pct.format(intRate));
			System.out.println("Interest: "+currency.format(interest));
			
			System.out.println("\nContinue? (y/n): ");
			choice= sc.next();
		}
		
		
		
		sc.close();
		System.out.println("Bye");
	}

}
