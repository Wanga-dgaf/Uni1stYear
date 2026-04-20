import java.util.Scanner;
import java.text.DecimalFormat;

public class WaterSupplyApp {
	public static void main(String [] args) {
		//Declare Scanner and Decimal Format
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,##0.00");
		
		//Variables
		final double CHARGE_PER_LITER = 10.55;
		final int WATER_ALLOCATION_1TO2 = 500;
		final int WATER_ALLOCATION_3TO5 = 1000;
		final int WATER_ALLOCATION_6PLUS = 1500;
		
		int noOfHouseholdMembers;
		double litersUsed, waterCost1to2, waterCost3to5, waterCost6plus ;
		
		System.out.print("Enter the number of household members or -1 to cancel: ");
		noOfHouseholdMembers = sc.nextInt();
		
		
		while(noOfHouseholdMembers != -1){
			System.out.print("Enter the actual water usage in liters: ");
			litersUsed = sc.nextDouble();
		
		if (noOfHouseholdMembers > 0) {
			if (noOfHouseholdMembers == 1 && noOfHouseholdMembers == 2) {
			
				waterCost1to2 = Math.max(0, CHARGE_PER_LITER * (litersUsed - WATER_ALLOCATION_1TO2));
				
				System.out.print("\nHousehold with " + noOfHouseholdMembers + " members will receive 500 liters of water. \nCost for excess usage: R " + df.format(waterCost1to2));
			
			
			} else if (noOfHouseholdMembers >= 3 && noOfHouseholdMembers <= 5) {
			
				waterCost3to5 = Math.max(0, CHARGE_PER_LITER * (litersUsed - WATER_ALLOCATION_3TO5));
				
				System.out.print("\nHousehold with " + noOfHouseholdMembers + " members will receive 1000 liters of water. \nCost for excess usage: R " + df.format(waterCost3to5));
			
				
				} else if (noOfHouseholdMembers >= 6 ) {
			
					waterCost6plus = Math.max(0, CHARGE_PER_LITER * (litersUsed - WATER_ALLOCATION_6PLUS));
				
					System.out.print("\nHousehold with " + noOfHouseholdMembers + " members will receive 1500 liters of water. \nCost for excess usage: R " + df.format(waterCost6plus));
					}
						} else {
							System.out.println("Invalid number of household members :( ");
							System.out.println("\nHousehold with " + noOfHouseholdMembers + " members will receive 0 liters of water. \nCost for excess usage: R 0.00");
							
							}
			System.out.print("\nEnter the number of household members or -1 to cancel: ");
			noOfHouseholdMembers = sc.nextInt();
			
		}
		
	}
}