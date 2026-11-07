import java.util.Scanner;

public class TestFuelConsuptionApp{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance travelled in kilometers: ");
        double distance = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter fuel type for your vehicle(95/93/DS)");
        String fuelType = sc.nextLine();

        System.out.println("Enter the number of litres consumed");
        double fuelConsumed = sc.nextDouble();

        FuelConsumptionApp fuel = new FuelConsumptionApp(distance, fuelType, fuelConsumed);

        
        fuel.calculateFuelEfficiency();
        fuel.determineFuelCost();
        

        System.out.println(fuel.toString());

    }
}