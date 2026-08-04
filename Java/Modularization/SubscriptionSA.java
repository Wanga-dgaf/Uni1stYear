import java.util.Scanner;
import java.text.DecimalFormat;

public class SubscriptionSA {
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("# ###.00");
		String name;
		int age = 0, subscriptionType = 0;
		double monthlyFee = 0, yearlyCost = 0, calculateYearlyCost;
		
		//Prompt for user input
		System.out.println("Please provide Name, Age, Subscription Type 1 or 2 or 3: ");
		name = sc.nextLine();
		age = sc.nextInt();
		subscriptionType = sc.nextInt();
		
		//Calling getMonthlyFee
		monthlyFee = getMonthlyFee (subscriptionType);
		
		//Call yearlyCost
		yearlyCost = calculateYearlyCost (monthly);
		
		//Qualifies For Student Discount
		if (qualifiesForStudentDiscount(age) == true ){
			calculateDiscount(monthlyFee);
		}
		
		displaySummary(name, age, getMonthlyFee, calculateDiscount,  calculateYearlyCost);
		
	}
	
	public static double getMonthlyFee (int subscriptionType){
		double monthlyFee = 0;
		if (subscriptionType == 1) {
			monthlyFee = 99;
		} else if(subscriptionType == 2){
			monthlyFee = 159;
		} else if(subscriptionType == 3){
			monthlyFee = 199; 
		} 
		
		return monthlyFee;
		

	}
	
	public static double calculateYearlyCost (double monthly){
		//double annual = monthlyFee * 12;
		//return annual;
		
		return monthly * 12;
		
	}
	
	public static boolean qualifiesForStudentDiscount (int age){
		//boolean isQualify = false;
		/*if (age >= 18 && age <= 25){
			isQualify = true;
		}
		
		return isQualify 
		*/
		
		if (age >= 18 && age <= 25){
			return true;
			
		} else {
			return false;
		}
		
	}
	
	public static double calculateDiscount (double monthlyFee){
		return monthlyFee * (1 - 0.15);
	}
	
	public static void displaySummary (String name, int age, double getMonthlyFee, double calculateDiscount, double calculateYearlyCost){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Monthly Fee: " + getMonthlyFee);
		System.out.println("Yearly Cost: " + calculateDiscount);
		System.out.println("Final Amount to Pay (Yearly): " + calculateYearlyCost);
	}
}