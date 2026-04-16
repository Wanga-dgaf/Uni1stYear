import java.util.Scanner;

public class PrjParse01 {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Anouncement
		System.out.println("Enter the cost below: ");
		String cost = sc.nextLine();
		try { 
			int customer = Integer.parseInt(cost);
			
			System.out.println("The customer has added more items: " + (customer + 10) );
		} catch (NumberFormatException e) {
			// This runs ONLY if the user typed something like "abc" or "10.5"
			System.out.println("Error: " + cost + " isn't a valid 	whole number!");
		}
		
		//Anouncement
		System.out.println("Enter the price below: ");
		String price = sc.nextLine();
		double discount = Double.parseDouble(price);
		
		
		System.out.println("The dscounted amount after R5 is: " + (discount - 5) );
		
		//Anouncement
		System.out.println("Enter the number below: ");
		String sNum = sc.nextLine();
		double dNum = Double.parseDouble(sNum);
		double roundedNum = Math.round(dNum * 100.0) / 100.0 ;		
		
		System.out.println(roundedNum);
		
		int student = sc.nextInt();
		sc.nextLine();
		double average = sc.nextDouble(); //include a decimal
		sc.nextLine();
		
		String textStudent = String.valueOf(student);
		String textAverage = String.valueOf(average);
		
		System.out.println("String length of Students: " + textStudent.length() );
		System.out.println("String length of Average" + textAverage.length() );
		
	}
}
