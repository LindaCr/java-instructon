import com.util.Console;

public class AreaCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area Calculator");

		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			String shape=getStringThree("Calculate area of a circle, square, or a rectangle? c/s/r",
									"c","s","r");
			
			if (shape.equalsIgnoreCase("c")) {
				double radius=Console.getDouble("Enter radius: ");
			}
			else if (shape.equalsIgnoreCase("s")) {
				double width=Console.getDouble("Enter width: ");
			}
			else if (shape.equalsIgnoreCase("r")) {
				double widthr=Console.getDouble("Enter width: ");
				double length=Console.getDouble("Enter length: ");
			}
			
			
			
			
			
			choice=Console.getString("Continue? y/n", "y", "n");
		}
		
		
		
		System.out.println("Peace");
	}

    public static String getStringThree(String prompt, String s1, String s2, String s3) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = Console.getString(prompt, true);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2) && !s.equalsIgnoreCase(s3)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" +
                        s2 +" or "+s3+ "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
	
}
