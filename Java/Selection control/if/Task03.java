import java.util.Random;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        //Variables
        int guess, num;
        
        System.out.println("Guess a number 1 or 2");
        guess = sc.nextInt();
        
        num = rand.nextInt(3);
        
        if (guess > 2 && guess < 1){
            if (guess == num){
                System.out.print("You've won");
            }
        } else {
            System.out.println("Invalid input, number should be 1 or 2");
        }
        
        
        
    }
}