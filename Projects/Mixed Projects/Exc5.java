import java.util.Scanner;

class Exc5 {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		char input = sc.next().charAt(0);
		
		switch(input) {
			case 'A':
			case 'a': 
				System.out.println("Apple");
				break;
				
			case 'B':
			case 'b': 
				System.out.println("Banana");
				break;
				
			case 'O':
			case 'o': 
				System.out.println("Orange");
				break;
				
			default:
                System.out.println("INVALID INPUT :( ");
			
		}
		
	}
}