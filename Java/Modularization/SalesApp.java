import java.util.Scanner;

public class SalesApp {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the price");
		double price = sc.nextDouble();
		
		System.out.println("Enter number of items");
		int noOfItems = sc.nextInt();
		
		//double total = price * noOfItems;
		double cost = getTotal(price, noOfItems);
		double discount = deterDiscount(cost);
		double vat = getVat(cost);
		double finalAmt = getTotalAmt(cost);
		
		
		displayInfo(cost, discount, vat, finalAmt);
		
		
	}

	//Access modifier....... return type.....methodName....parameters
	public static void displayInfo(double total, double deterDiscount, double getVat, double getTotalAmt){
		System.out.println("Total : (VAT exclusive)" + total);
		System.out.println("discount: " + deterDiscount(total));
		System.out.println("VAT Amount: " + getVat(total));
		System.out.println("Total Amount: " + getTotalAmt(total));
	}
	
	public static double getTotal(double price, int noOfItems){
		return price * noOfItems;
	}
	
	//Write a function called deterDiscount that receives total amount to determine the
	//discount percentage (total>R100 : is 10% else 0) .then return the percentage to
	//caller
	
	public static double deterDiscount(double total){
		double disc = 0;
		
		if (total > 100){
			disc = total * 0.10;
			return disc;
			
		} 
		
		return disc;
	}

	//Function called getVat
	public static double getVat(double total){
		return (total - deterDiscount(total)) * 0.15;
	}
	
	//function called getTotalAmt that receives total amt and %
	
	public static double getTotalAmt(double total){
		return total - deterDiscount(total) + getVat(total);
	}
	
}