import java.util.Scanner;

public class WeightLossApp {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		//Variables
		final double averageWeightLoss = 3.5;
		
		int j = 0, countWeightLoss = 0;		
		double weight = 0, grandWeight = 0;
		System.out.println("*************** Weight Loss Monitoring ***************\n");
		
		for(int i = 1; i <= 6; i++){
			//Prompt user for input
			System.out.print("Enter your weight for month " + i + " in kg: ");
			weight = sc.nextDouble();
			
			//Check if weight loss is above average
			if (weight > averageWeightLoss) {
				System.out.println("\tYour weight loss is above average this month");
				
				countWeightLoss++ ;
			}
			
			grandWeight += weight ;
		}
		
		System.out.println("\nYour total weight loss in 6 months: " + grandWeight);
		System.out.println("In " + countWeightLoss + " month(s) you lost more than the average weight" );
		
		//Close scanner to free up resources
		sc.close();
		
	}
}