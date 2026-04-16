import java.util.Scanner;

public class prjIntelligenceTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your name: ");
        String name = sc.nextLine();

		
        if (name.equalsIgnoreCase("junior") || 
            name.equalsIgnoreCase("khaka") || 
            name.equalsIgnoreCase("qhayiya")) {
            System.out.println("You are dumb and you don't bath");
        } else {
            System.out.println("You are smarter than junior");
			
        }
        
        sc.close(); // Good practice to close Scanner
    }
} 