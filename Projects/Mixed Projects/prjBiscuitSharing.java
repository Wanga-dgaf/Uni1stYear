import java.util.Scanner;

public class prjBiscuitSharing {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	 //Number of biscuits
    System.out.println("Number of biscuits: ");
    int noBiscuits = sc.nextInt();	
		
    //Number of plates
    System.out.println("Number of plates: ");
    int noPlates = sc.nextInt();

    //Number of biscuits per plate
    int biscuitShared = noBiscuits/noPlates;
    int biscuitLeft = noBiscuits%noPlates;

    System.out.println("Biscuits in each plate: " + biscuitShared);
    //Run if there is a remainder
    if (biscuitLeft > 0) {
    System.out.println("Biscuits left: " + biscuitLeft);
    }
    }
}
