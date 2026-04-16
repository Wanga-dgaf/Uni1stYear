import java.util.Scanner;

public class PrjSparklingCleanCompany {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		
		final double HANDHELD = 50 ;
		final double HANDHELD_ADD = 30 ;
		final double WET_AND_DRY = 62.52 ;
		final double WET_AND_DRY_ADD = 36.25 ;
		final double HYDRO_VACUUM = 74.87 ;
		final double HYDRO_VACUUM_ADD = 40.50 ;
		
		//*****ANNOUNCEMENT*****
		System.out.println("WRITE YOUR NAME AND SURNAME DOWN BELOW: ");
		String sName = sc.nextLine();
		System.out.println("WELCOME TO CHOOSE SPARKLING CLEAN COMPANY \nCHOOSE ONE OF THE FOLLOWING OPTIONS\n H/h - HANDHELD\n W/w - WET AND DRY\n V/v - HYDRO VACUUM");
		char input = sc.next().charAt(0);
		//sc.nextLine();
		System.out.println("WRITE THE AMOUNT OF MINUTES THE MACHINE WILL BE HIRED FOR\n (the amount of minutes will be rounded up to the nearest hour) ");
		double duration = sc.nextDouble();
		sc.nextLine();
		int time = (int) Math.ceil(duration / 60);
		
		
		
		do { 
		
			switch (Character.toUpperCase(input)) {
				case 'H':
					double amountDue, vatAmount, totalAmount;
					if (time <= 1 ) {
						amountDue = HANDHELD * time ;
						vatAmount = amountDue * 0.15 ;
						totalAmount = amountDue + vatAmount ;
						System.out.println("Client Name: " + sName + "\n Machine for hire: Wet and Dry " + "\n Hours hired for: " + time + "\n Amount (excl VAT): R"+ amountDue + "\n VAT Amount: " + vatAmount + "\n Total Amount(incl VAT): " + totalAmount);
						
					} else {
						amountDue = (HANDHELD_ADD * (time - 1)) + HANDHELD ;
						vatAmount = amountDue * 0.15 ;
						totalAmount = amountDue + vatAmount ;
						System.out.println("Client Name: " + sName + "\n Machine for hire: Wet and Dry " + "\n Hours hired for: " + time + "\n Amount (excl VAT): R"+ amountDue + "\n VAT Amount: " + vatAmount + "\n Total Amount(incl VAT): " + totalAmount);
						}
					break;
					
				case 'W':
					
					
				case 'V':
					
					
				default:
					System.out.println("INVALID INPUT :( ");
			} break;
			
		} while (duration < 0 );
            System.out.println("INVALID INPUT :(\n number cannot be a negative ");
			
		
	}
}