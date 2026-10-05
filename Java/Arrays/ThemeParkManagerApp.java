import java.util.Random;
import java.util.Scanner;

public class ThemeParkManagerApp {
    static Random rd = new Random();
    public static void main(String[] args) {
        //Declaring a Scanner and Random
        Scanner sc = new Scanner(System.in);
        

        //Arrays
        String[] rideNames = {"Anaconda", "Golden Loop", "Water Slide", "Log House", "Tower Terror"};
        double[] ticketPrices = {50.50, 47.00, 55.00, 42.00, 75.99};
        int[] ticketsSold = new int[5];
        double[] revenues = new double[5];

        //Variables 
        String rideName = "";
        

        populateTicketSold(ticketsSold);

        calculateRevenue(ticketsSold, ticketPrices, revenues);

        displayRidesInformation(rideNames, ticketsSold, ticketPrices, revenues);

        sortByTicketPrice(rideNames, ticketsSold, ticketPrices, revenues);
		System.out.println("\n\nOrdered from the cheapest ticket to the most expensive");
        displayRidesInformation(rideNames, ticketsSold, ticketPrices, revenues);

        //prompt the user to search the ride the want
        System.out.print("\n\nEnter a ride to search: ");
        rideName = sc.nextLine();
        
        int rideSearched = searchRide(rideNames, rideName);
        if(rideSearched != -1){
            System.out.printf("%-10s %-10.2f", rideNames[rideSearched], ticketPrices[rideSearched]);
        } else {
            System.out.println("Ride not found.");
        }        
    }

    public static void populateTicketSold(int[] ticketsSold) {
        for (int i = 0; i < ticketsSold.length; i++){
            int noOfTicketsBought = rd.nextInt(100);
            ticketsSold[i] = noOfTicketsBought;
        }
    }

    public static void calculateRevenue(int[] ticketsSold, double[] ticketPrices, double[] revenues){
        for (int i = 0; i < ticketsSold.length; i++) {
            revenues[i] = ticketsSold[i] * ticketPrices[i];
        }

    } 

    public static int searchRide(String[] rideNames, String rideName) {
        for(int i = 0; i < rideNames.length; i++){
            if(rideName.equalsIgnoreCase(rideNames[i])){
                return i;
            }
        } return -1;
    }

    public static void sortByTicketPrice(String[] rideNames, int[] ticketsSold, double[] ticketPrices, double[] revenues) {
        double tempPrice = 0, tempRevenue = 0;
        int tempTickets = 0;
        String tempNames = "";
        for(int i = 0; i < ticketPrices.length; i++){
            for(int j = 0 ;j < ticketPrices.length - 1; j++){
                if( ticketPrices[j] > ticketPrices[j + 1]){

                    //Sorting Ticket Prices
                    tempPrice = ticketPrices[j];
                    ticketPrices[j] = ticketPrices[j + 1];
                    ticketPrices[j + 1] = tempPrice;

                    //Sorting Ride Names
                    tempNames = rideNames[j];
                    rideNames[j] = rideNames[j + 1];
                    rideNames[j + 1] = tempNames;

                    //Sorting Number of Tickets
                    tempTickets = ticketsSold[j];
                    ticketsSold[j] = ticketsSold[j + 1];
                    ticketsSold[j + 1] = tempTickets;

                    //Sorting Ticket Revenue
                    tempRevenue = revenues[j];
                    revenues[j] = revenues[j + 1];
                    revenues[j + 1] = tempRevenue;
                }
            }
        }
    }

    public static void displayRidesInformation(String[] rideNames, int[] ticketsSold, double[] ticketPrices, double[] revenues) {
        System.out.printf("%-15s %-20s %-20s %-20s%n", "Ride Name", "Tickets Sold", "Ticket Prices", "Revenue");

        for(int i = 0; i < rideNames.length; i++){
            System.out.printf("%-15s %-20d %-20.2f %-20.2f%n", rideNames[i], ticketsSold[i], ticketPrices[i], revenues[i]);
        }
    }
}