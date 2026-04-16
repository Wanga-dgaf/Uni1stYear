import java.util.Scanner;
public class prjBank {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		         //ANOUNCEMENT
		System.out.println("SELECT OPTION");
		System.out.println("1 - DEPOSIT");
		System.out.println("2 - WITHDRAW");
		System.out.println("3 - CHECK BALANCE");
		System.out.println("WRITE THE NUMBER ONLY");
		
		int option = sc.nextInt();
		boolean isValid = false; 
		int bankBalance = 10000;
				
		while (!isValid) {
			if (option == 1 ) {
				System.out.println("Write amount to deposit below: ");
				int amount = sc.nextInt();				
				sc.nextLine();
				System.out.println("*********************\n\nMR. WMP MANDIWANA" + "\nAMOUNT TO DEPOSIT: R" + amount + "\nBALANCE: R" + bankBalance + "\nCURRENT BALANCE: R" + (bankBalance + amount) + "\n\n*********************");
				
				isValid = true;
				
			} else if (option == 2) { 
				System.out.println("Write amount to withdraw below: ");
				int amount = sc.nextInt();				
				sc.nextLine();
				System.out.println("*********************\n\nMR. WMP MANDIWANA" + "\nAMOUNT TO WITHDRAW: R" + amount + "\nBALANCE: R" + bankBalance + "\nCURRENT BALANCE: R" + (bankBalance - amount) + "\n\n*********************");
				
				isValid = true;
			} else if (option == 3) { 
				System.out.println("*********************\n\nMR. WMP MANDIWANA" + "\nCURRENT BALANCE: R" + bankBalance + "\n\n*********************");
				
				isValid = true;
				
			} else { 
				System.out.println("INVALID INPUT");
			}
			
		}
		
	}
	
}