import java.util.Scanner;

public class PrjNextLvl {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double dLvl1 , dLvl2, dLvl3;
		boolean bLvlCompletion = false;
		int iLvlCount = 0;
		
		//*****ANNOUNCEMENT*****
		System.out.println("What is 1 + 1? ");
		dLvl1 = sc.nextDouble();
		
		if (dLvl1 == 2) {
			System.out.println("Congrats!!!\n Proceed to level 2!!\n");
			iLvlCount += 1;
			
		} else {
				System.out.println("Incorrect :( \n");
				
			}
			
		System.out.println("What is 3 * 5? ");
		dLvl2 = sc.nextDouble();
			
		if (dLvl2 == 15) {
			System.out.println("Congrats!!!\n Proceed to level 3!!\n");
			iLvlCount += 1;
			
		} else {
				System.out.println("Incorrect :( \n");
				
			}
			
		System.out.println("What is 7 * 19? ");
		dLvl3 = sc.nextDouble();
		
		if (dLvl3 == 133) {
			System.out.println("Congrats!!!\n Completed all levels!!\n");
			iLvlCount += 1;
			
		} else {
				System.out.println("Incorrect :( \n");
				
			}
			
		if (iLvlCount == 3) {
			bLvlCompletion = true;
		}
		
		if (bLvlCompletion) {
			System.out.println("Congrats once again you have have completed all levels correctly");
			
		} else {
			
			switch (iLvlCount) {
			case 2:
				System.out.println("YOU GOT 2 CORRECT, NICE TRY");
				break;
				
			case 1:
				System.out.println("YOU ONLY GOT 1 CORRECT, THAT'S BAD");
				break;
				
			default:
				System.out.println("YOU DID NOT GET EVEN 1 ANSWER CORRECT, SHAME ON YOU. HOW DO YOU EVEN GET 1 + 1 INCORRECT");
				break;
			}
		}
		
	}
	
	/*public static void main(String[] args) {
		String[] questions = {"1 + 1", "3 * 5", "7 * 19"};
		double[] answers = {2.0, 15.0, 133.0};
		int score = 0;

		for (int i = 0; i < questions.length; i++) {
			System.out.println("What is " + questions[i] + "?");
			if (sc.nextDouble() == answers[i]) {
				System.out.println("Congrats!!!\n");
				score++;
			} else {
				System.out.println("Incorrect :( \n");
        }
    }
    
    // Your switch-case logic would follow here using 'score'
	}*/
}