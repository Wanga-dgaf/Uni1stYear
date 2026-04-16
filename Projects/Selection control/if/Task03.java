import java.util.Scanner;
import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        //Variables
        int guess, num;
        
        System.out.println("Guess a number between 1 and 2");
        guess = sc.nextInt();
        
        num = rand.nextInt(3);
        
        if (guess == num){
            System.out.print("You've won");
        }
        
        
        
    }
}