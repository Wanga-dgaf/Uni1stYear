import java.util.Scanner;

public class prjCalculator {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    boolean success = false;
		
		while (!success) {
		
		//--- ANNOUNCEMENT ---
		System.out.println("First number has to be smaller than the second number");
		
		System.out.println("First Number: ");
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Second Number: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		//CHECKS IF SECOND IS BIGGER
		if (num1 < num2) {
			
		//ADDITION
		int sum = num1 + num2;
		System.out.println("Sum of numbers: " + sum);
		
		//SUBTRACTION
		int diff = num2 - num1;
		System.out.println("Differnce of numbers: " + diff);
		
		//MULTPLY
		int product = num1 * num2;
		System.out.println("Multiplication:" + product);
		
		//DIVISION
		double quotient = (double)num2 / num1;
		System.out.println("Quotient: " + quotient);
		
		//MODULUS(Remainder)
        int remainder = num2 % num1;
        System.out.println("Remainder of " + num2 + "/" + num1 + ": " + remainder);
		
		success = true; // WON'T REPEAT BECAUSE IT IS TRUE
		
		} else { //REPEAT ASHEES
			System.out.println("THE 1ST VALUE IS SUPPOSED TO BE SMALLER  ");
			System.out.println("TRY AGAIN DUMBASS");
			
		  }
		}
		sc.close();
		
	}	
}