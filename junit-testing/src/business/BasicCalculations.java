package business;

import com.util.Console;

public class BasicCalculations {

	public static int getSquare(int nbr) {
		int nbrSquare=(nbr*nbr);
		return nbrSquare;
	}
	
	public static int getCountA(String str) {
		int aCount=0;
		
		str=str.toLowerCase();
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)=='a') {
				aCount++;
			}
		}
		
		return aCount;
	}
	
}
