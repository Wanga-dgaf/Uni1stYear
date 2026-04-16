import java.util.Scanner;

public class Prj2024CT {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		final double COMMISSION_RATE = 65.50;
		final double SHUTTLE_RATE = 7.50 * 2;
		String sName;
		int noDays;
		
		System.out.println("Enter sales person name: " );
		sName = sc.nextLine();
		System.out.println("Enter number of days workeds: " );
		noDays = sc.nextInt();
		sc.nextLine();
		
		double weeklyCommission = (double)noDays * COMMISSION_RATE;
		double travelFare = (double)noDays * SHUTTLE_RATE;
		double remainingWage = weeklyCommission - travelFare;
		
		System.out.println("SALESPERSONS DETAILS \n=========================== \nSALES PERSON NAME: " + sName + "\nWEEKLY COMMISSION: " + weeklyCommission + "\nTRAVEL FARE: " + travelFare + "\nWEEKLY WAGE: " + remainingWage);
		
		
	}
}