public class FuelConsumptionApp{
    private double fuelConsumed;
    private double distance;
    private double efficiency;
    private double fuelCost;
    private String fuelType;



    public FuelConsumptionApp(double distance, String fuelType, double fuelConsumed){
        this.distance = distance;
        this.fuelType = fuelType;
        this.fuelConsumed = fuelConsumed;
    }

    public void calculateFuelEfficiency(){
        efficiency = (fuelConsumed / distance) * 100;
    }

    public void determineFuelCost(){
        if (fuelType.equalsIgnoreCase("95")) {
            fuelCost = 22.75 * fuelConsumed;
        } else if (fuelType.equalsIgnoreCase("93")) {
            fuelCost = 21.15 * fuelConsumed;
        } else if (fuelType.equalsIgnoreCase("DS")) {
            fuelCost = 20.70 * fuelConsumed;
        }
    }

    public String toString(){
        
        return "Distance: " + distance + " \nFuel Type: " + fuelType + " \nFuel Consumed: " + fuelConsumed + " \nCost: " + fuelCost;
    }
}