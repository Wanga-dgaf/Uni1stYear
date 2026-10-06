import java.util.Scanner;

public class ProductInventoryManager{
    public static void main(String[] args) {
        //Arrays
        String[] productNames = {"Sugar", "Laptop", "Book", "Dress", "Sphahlo", "Panado"};
        String[] productCategories = {"Food", "Electronics", "Stationery", "Clothing", "Food", "Health"};
        double[] productPrice = new double[6];
        int[] productQuantities = new int[6];
        
    }

    public static void addProducts(String[] productNames, double[] productPrice, int[] productQuantities){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < productNames.length; i++){
            System.out.print("Enter the price for " + productNames[i] + ": ");
            productPrice[i] = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter the quantity for " + productNames[i] + ": ");
            productQuantities[i] = sc.nextInt();

        }
        
    }

    public static void viewProducts(String[] productNames, String[] productCatagories, double[] productPrice, int[] productQuantities){
        for(int i = 0; i < productNames.length; i++){
            System.out.printf("%-10d %-15s %-15s %-15.2f %-15d", "No.", "Name", "Category", "Price", "Quantity");
            System.out.printf("%-10d %-15s %-15s %-15.2f %-15d", (i + 1), productNames[i], productCatagories[i], productPrice[i], productQuantities[i]);
        }
    }

    public static int searchProducts(String[] productNames){
        String searchedName = "";
        int index = -1;
        for(int i = 0; i < productNames.length; i++){
            if(searchedName.equalsIgnoreCase(productNames[i])){
                index = i;
            }
        } return index;
    }

    public static void updateStockQuantity(String[] productNames, int[] productQuantities){
        String searchedName = "";

        for(int i = 0; i < productNames.length; i++){
            if(searchedName.equalsIgnoreCase(productNames[i])){
                productQuantities[i] = sc.nextInt();                
            }
        }
    }

    public static void sortProducts(String[] , String[] , double[] , int[] ){

    }
}