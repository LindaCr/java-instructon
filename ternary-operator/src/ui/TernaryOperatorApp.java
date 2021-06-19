package ui;

public class TernaryOperatorApp {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		
		int num=8;
		System.out.println("Number is "+num);
		String msg1="";
		if (num>10) {
			msg1="Number is greater than 10";
		}
		else {
			msg1="Number is less than or equal to 10";
		}
		System.out.println(msg1);
		
		//replace if/else statement with ternary operator
		System.out.println("Ternary version");
		String msg2= num >10? "Number is greater than 10": "Number is less than 10";
								//1st statement is like if:2nd is like else
		System.out.println(msg2);
		
		//nested ternary
		String msg3= num>10? "Number is greater than 10": 
				(num>5? "Number is greater than 5": "Number is less than 5");
		System.out.println(msg3);
		
		//  call a method
		String msg4= (num%2==1)? "Number is odd, times 2"+timesTwo(num): 
			"Number is even";
			System.out.println(msg4);
		
		
		System.out.println("Peace");

	}

	private static int timesTwo(int i) {
		//print i times two
		return (i*2);
	}
	
}
