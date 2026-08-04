import java.util.Scanner;
import java.text.DecimalFormat;

public class CharityGamesApp {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		//Variables
		final double ENTRY_FEE = 15.00;
		final double PARKING_FEE = 16.00;
		final double EXCESS_SPECTATORS_FEE = 15.50;
		final int EXCESS_SPECTATORS = 4;
		
		int noOfSpectators = 0,
		totalSpectators = 0,
		reservedParking = 0;
		double totalAmount = 0,
		amount = 0,
		grandTotal = 0;
		String parking;
		
		
		//Prompt for user input
		System.out.print("Enter the number of spectators: ");
		noOfSpectators = sc.nextInt();
		sc.nextLine();
		
		
		//Check if is not 0
		if (noOfSpectators > 0) {
			System.out.print("Do you need parking? (Y/y - yes, N/n - No): ");
			parking = sc.nextLine();
		
			do{
				
				
				if (noOfSpectators > EXCESS_SPECTATORS){
					amount = (noOfSpectators * ENTRY_FEE) + ((noOfSpectators - EXCESS_SPECTATORS) * EXCESS_SPECTATORS_FEE);
					
				} else {
					amount = noOfSpectators * ENTRY_FEE;
					}
					
				if (parking.equalsIgnoreCase("Y")){
					totalAmount = amount + PARKING_FEE;
					System.out.println("The total due is: R" + df.format(totalAmount));
					
					reservedParking++;
				} else if (parking.equalsIgnoreCase("N")){
					System.out.println("The total due is: R" + df.format(amount));
				}
					
					totalSpectators += noOfSpectators;
					
					System.out.print("Enter the number of spectators for the next group, or 0 to exit: ");
					noOfSpectators = sc.nextInt();
					sc.nextLine();
					if (noOfSpectators != 0){
						System.out.print("Do you need parking? (Y/y - yes, N/n - No): ");
						parking = sc.nextLine();
						
					}
				
					
				
				
			} while(noOfSpectators != 0);
			
		}
		
		System.out.println("There are " + totalSpectators + " spectators booked today.");
		System.out.println("There are " + reservedParking + " parking bays reserved.");
		
		
	}
}