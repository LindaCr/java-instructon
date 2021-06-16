package ui;

import java.text.NumberFormat;

import com.util.Console;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		System.out.println();
		
		String choice="y";
		while (choice.equalsIgnoreCase("y")) {
			
			int atBatNbr=Console.getInt("Enter number of times at bat: ", 
					                       1, 30);
			//at bat resuts greater than zero
			int abr=0;
			//total bases earned
			int basesEarned=0;
			int[] atBatResults=new int[atBatNbr];
			for (int i=0; i< atBatNbr; i++) {
				int result=Console.getInt("Result for at-bat "+(i+1)+": ", 0, 4);
				atBatResults[i]=result;
				if (result >0) {
					abr++;
				}
				basesEarned+=result;
			}
			System.out.println();
			double battingAverage= (double)abr/atBatNbr;
			double sluggingPct= (double) basesEarned/atBatNbr;
			
			NumberFormat nf= NumberFormat.getNumberInstance();
			nf.setMinimumFractionDigits(3);
			System.out.println("Batting average: "+nf.format(battingAverage));
			System.out.println("Slugging percent: "+nf.format(sluggingPct));
			
			
			
			
			
			choice=Console.getString("Add another player? y/n ", "y", "n");
		}
		
		System.out.println("Peace");

	}

}
