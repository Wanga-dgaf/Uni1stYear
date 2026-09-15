import java.text.DecimalFormat;
import java.util.Scanner;

public class AthleticsTeamApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##.0");


        String[] membersNames = {"Sello M.", "Jason P.", "Lethu A.", "Banda B.", "Johnn B.", "Wicky J."};
        int[] membersAges = {35, 42, 42, 25, 32, 49};
        double[] distanceRun = new double[6];
        //Variables
        int count = 0;
        double km = 0;


        for (int i = 0; i < membersNames.length; i++){
            System.out.print("Enter distance ran by " + membersNames[i] + " (in kilometers): "); 
            distanceRun[i] = sc.nextDouble();
            
        }

        double average = calcAvgDistance(distanceRun);
        int fastestRunner = determineFastRunner(distanceRun, average);
        
        displayMemberDetails(membersNames, membersAges, distanceRun, average, fastestRunner);
        

    }

    public static double calcAvgDistance (double[] distanceRun){
        double count = 0, totalDistance = 0, average = 0;

        for (int i = 0; i < distanceRun.length; i++){
            
            totalDistance += distanceRun[i];
            
        }
        average = totalDistance/distanceRun.length;
        return average;
    }

    public static int determineFastRunner(double[] distanceRun, double avgDistances){
        int count = 0;
        //avgDistances = calcAvgDistance(distanceRun);
        for (int i = 1; i < distanceRun.length; i++){
            
            if (distanceRun[i] > distanceRun[count]){
                count = i;
            } 
            
        }
        return count;
    }

    public static void displayMemberDetails(String[] membersNames, int[] membersAges, double[] distanceRun, double avgDistance, int count){
    
        count = determineFastRunner(distanceRun, avgDistance);
        avgDistance = calcAvgDistance(distanceRun);
        System.out.println("Club members details: ");
        System.out.printf("%-15s %-10s %-10s%n","Name", "Age", "Distance");

        for (int i = 0; i < membersNames.length; i++){
            
            System.out.printf("%-15s %-10d %-10.1f%n",membersNames[i], membersAges[i], distanceRun[i]);
            
        }

        System.out.println(membersNames[count] + " run is above the average distance by club members ");
        System.out.printf("Average distance Run by Club Members: %.1f", avgDistance,  " kilometers");
        
        
    }
}