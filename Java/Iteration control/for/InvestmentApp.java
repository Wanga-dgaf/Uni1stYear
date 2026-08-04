import java.util.Scanner;

public class InvestmentApp {
    public static void main (String [] args) {
        //intialize scanner
        Scanner sc = new Scanner(System.in);

        //variables
        final double FIXED_DEPOSIT_INTEREST_RATE = 0.1106;
        final double PURE_SAVE_INTEREST_RATE = 0.058;
		
        double investmentAmount = 0, totalAmount = 0, initialAmount = 0, totalInterest = 0, interestAmount = 0, interest = 0;
		String investmentOption;
		int i = 0, j = 1;

        //user input
        System.out.print("Enter the your initial investment amount:  ");
        initialAmount = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Enter your investment option (F/f - Fixes OE P/p Pure Save): ");
		investmentOption = sc.nextLine();
		
		if (investmentOption.equalsIgnoreCase("F")){
			interest = initialAmount * FIXED_DEPOSIT_INTEREST_RATE;
			interestAmount = interest;
			
			for (; i < 5; i++) {
				System.out.println("Year " + j + ": Investment R: " + interestAmount);
				interestAmount += interest;
				totalInterest += interestAmount;
				j++;
				
			}
			
			System.out.println("\nTotal interest earned " + totalInterest);
			totalAmount = initialAmount + totalInterest;
			System.out.println("Total investment after 5 years:  " + totalAmount);
			
		} else if (investmentOption.equalsIgnoreCase("P")) {
				interest = initialAmount * PURE_SAVE_INTEREST_RATE;
				interestAmount = interest;
				
				for (; i < 5; i++) {
					System.out.println("Year " + j + ": Investment R: " + interestAmount);
					interestAmount += interest;
					totalInterest += interestAmount;
					j++;
				
				}
				
				System.out.println("\nTotal interest earned " + totalInterest);
				totalAmount = initialAmount + totalInterest;
				System.out.println("Total investment after 5 years:  " + totalAmount);
				
			} else {
				System.out.println("Invalid interest option");
			}
			
			

        


    }
}