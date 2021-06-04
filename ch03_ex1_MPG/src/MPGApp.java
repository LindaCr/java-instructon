import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            Double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            Double gallons = sc.nextDouble();
            
            
            //double mpg = miles/gallons;
            //mpg=(double)Math.round(mpg*100) /100;
            //System.out.println("Miles per gallon is "+mpg+".");
            
            
            //NumberFormat number= NumberFormat.getNumberInstance();
            //number.setMaximumFractionDigits(1);
            //System.out.println("Miles per gallon is " + (number.format(mpg)) + ".");
            
            NumberFormat number= NumberFormat.getNumberInstance();
            BigDecimal bg1, bg2, bg3;
            
            bg1= new BigDecimal (miles);
            bg2= new BigDecimal (gallons);
            bg3= bg1.divide(bg2, 2, RoundingMode.HALF_UP);
            
            System.out.println("Miles per gallon is "+bg3+".");
            
            
            
            
            System.out.println();
            
            
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
