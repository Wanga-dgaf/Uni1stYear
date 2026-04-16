import java.util.Scanner;

public class Task01 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//Variables
		int i, num = 0, grandNum = 0;
		
		System.out.println("Write any number: ");
		num = sc.nextInt();
		
		i = 0;
		while(i<6){
			System.out.println("Write any number: ");
			num = sc.nextInt();
			i++;
			grandNum += num;
		}
			System.out.print(grandNum);
		
	}
}