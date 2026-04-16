import java.util.Scanner;
public class LogicalOperators {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isValid = false;
		
		while (!isValid) {
		System.out.println("Enter M or F for gender");
		String Gender = sc.nextLine();
		
		
		
			if (Gender.equals("M")) {
				System.out.println("You are a Male");
				isValid = true;
			
			} else if (Gender.equals("F")) {
				System.out.println("You are a Female"); 
				isValid = true;
				
			} else { 
				System.out.println("Invalid input");
			}
		}
		
		
	}
}