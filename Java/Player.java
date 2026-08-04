import java.util.*;

class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
		
		//Variable
		Random rand = new Random();
		int i = 1, num1, num2;
		

        // game loop
			System.out.println("Player 1 vs Player 2 \n");
           

            // Write an action using System.out.println()
           do{ 
				num1 = rand.nextInt(10); // number to player 1
				num2 = rand.nextInt((10 - 0) + 0); // number to enemy 2
				
				if (num1 < num2) {
					System.out.println(i + " Player 1 Wins");
					} else {
						System.out.println(i + " Player 2 Wins");
						}
				
				i++;
		   } while(num1 != num2);
		   
         

        
    }
}
