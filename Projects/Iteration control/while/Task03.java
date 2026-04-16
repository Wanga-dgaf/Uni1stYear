import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Variable to hold the user's gender input
        String gender;

        // Keep running the program until the user enters "2" to stop
        while (true) {

            // Prompt user to enter a gender character or 2 to quit
            System.out.print("Enter gender (F/f or M/m), or 2 to quit: ");
            gender = scanner.nextLine();

            // Check if user wants to exit the program
            if (gender.equals("2")) {
                System.out.println("Program stopped. Goodbye!");
                break; // Exit the while loop
            }

            // Check if the input is a valid gender character (F, f, M, or m)
            if (gender.equalsIgnoreCase("F")) {

                // Ask how many times to display the female message
                System.out.print("How many times to display the message? ");
                int times = Integer.parseInt(scanner.nextLine());

                // Display the female message the requested number of times
                for (int i = 0; i < times; i++) {
                    System.out.println("You are female");
                }

            } else if (gender.equalsIgnoreCase("M")) {

                // Ask how many times to display the male message
                System.out.print("How many times to display the message? ");
                int times = Integer.parseInt(scanner.nextLine());

                // Display the male message the requested number of times
                for (int i = 0; i < times; i++) {
                    System.out.println("You are male");
                }

            } else {
                // Input was not F, f, M, m, or 2 — prompt the user to try again
                System.out.println("Please enter either an M/m or F/f");
            }

        } // End of while loop

        // Close the scanner to free up resources
        scanner.close();
    }
}
