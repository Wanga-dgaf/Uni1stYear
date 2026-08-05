import java.text.DecimalFormat;
import java.util.Scanner;

public class SubscriptionSA {
	static DecimalFormat df = new DecimalFormat("# ###.00");
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int age, subscriptionType;
        double monthlyFee, yearlyCost, finalAmount;

        // --- Prompt for input exactly as shown in Figure 1.1 / 1.3 ---
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Choose your subscription type:");
        System.out.println("1. Basic (R99)");
        System.out.println("2. Standard (R159)");
        System.out.println("3. Premium (R199)");
        System.out.print("Enter option (1-3): ");
        subscriptionType = sc.nextInt();

        // Determine the monthly fee based on the chosen plan (Table 1.1)
        monthlyFee = getMonthlyFee(subscriptionType);

        // Calculate the yearly cost from the ORIGINAL (not discounted) monthly fee
        yearlyCost = calculateYearlyCost(monthlyFee);

        // Final amount without discount = the monthly fee itself
        finalAmount = monthlyFee;

        // If the user qualifies for a student discount, recalculate final amount
        if (qualifiesForStudentDiscount(age)) {
            finalAmount = calculateDiscount(monthlyFee);
        }

        // Display the subscription summary
        displaySummary(name, age, monthlyFee, yearlyCost, finalAmount);

        sc.close();
    }

    // Returns the monthly fee for the given subscription type (Table 1.1)
    public static double getMonthlyFee(int subscriptionType) {
        double monthlyFee = 0;
        if (subscriptionType == 1) {
            monthlyFee = 99;
        } else if (subscriptionType == 2) {
            monthlyFee = 159;
        } else if (subscriptionType == 3) {
            monthlyFee = 199;
        }
        
        return monthlyFee;
    }

    // Calculates the yearly cost from a monthly fee
    public static double calculateYearlyCost(double monthlyFee) {
        return monthlyFee * 12;
    }

    // Checks whether the given age qualifies for the student discount (18-25 inclusive)
    public static boolean qualifiesForStudentDiscount(int age) {
        return (age >= 18 && age <= 25);
    }

    // Applies a 15% discount to the given monthly fee and returns the discounted amount
    public static double calculateDiscount(double monthlyFee) {
        return monthlyFee * (1 - 0.15);
    }

    // Displays the subscription summary
    public static void displaySummary(String name, int age, double monthlyFee,
            double yearlyCost, double finalAmount) {
        System.out.println("\n--- Pay TV Subscription Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Monthly Fee: R" + monthlyFee);
        System.out.println("Yearly Cost: R" + yearlyCost);
        System.out.println("Final Amount to Pay (Yearly): R" + df.format(finalAmount));
    }
}