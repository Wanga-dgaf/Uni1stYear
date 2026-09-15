public class MovieRentalManager {
    public static void main(String[] args) {
        // 1. Declare two parallel arrays
        String[] genres = {"Action", "Comedy", "Drama", "Horror", "Sci-Fi"};
        int[] rentals = {120, 85, 40, 95, 150};

        System.out.println("--- Initial Genres and Rentals ---");
        display(genres, rentals);

        // 2. Call addRentals to add a specified number of rentals to a genre
        System.out.println("\nAdding 50 rentals to 'Comedy'...");
        addRentals(genres, rentals, "Comedy", 50);

        // 3. Call determineHighestRentalGenre to find the index with the highest rentals
        int highestIndex = determineHighestRentalGenre(rentals);
        System.out.println("\nGenre with highest rentals: " + genres[highestIndex] + " (" + rentals[highestIndex] + " rentals)");

        // 4. Call sortByRentals to sort the genres based on total rentals (descending)
        System.out.println("\nSorting genres by total rentals...");
        sortByRentalGenre(genres, rentals);

        // 5. Call display method to display sorted data (highest at top)
        System.out.println("\n--- Displaying Sorted Movie Rentals ---");
        display(genres, rentals);

        // 6. Call resetRentals method to set all rental counts to zero
        System.out.println("\nResetting all rental counts to 0...");
        resetRentals(rentals);

        System.out.println("\n--- Displaying After Reset ---");
        display(genres, rentals);
    }

    // Adds a specified number of rentals to a matching genre
    public static void addRentals(String[] genres, int[] rentals, String genreName, int noOfRentals){
        int index = findGenreIndex(genres, genreName);
        if (index != -1) {
            rentals[index] += noOfRentals;
        } else {
            System.out.println("Genre '" + genreName + "' not found.");
        }
    
    }

    // Helper method to locate the index of a specified genre name
    public static int findGenreIndex(String[] genres, String genreName){
        for (int i = 0; i < genres.length; i++) {
            if (genres[i].equalsIgnoreCase(genreName)) {
                return i;
            }
        }
        return -1; // Return -1 if not found
    }

    // Returns the index of the genre with the highest rental count
    public static int determineHighestRentalGenre(int[] rentals){
        int maxIndex = 0;
        for (int i = 1; i < rentals.length; i++) {
            if (rentals[i] > rentals[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Sorts the parallel arrays in descending order based on rental counts
    public static void sortByRentalGenre(String[] genres, int[] rentals){
        for (int i = 0; i < rentals.length - 1; i++) {
            for (int j = 0; j < rentals.length - 1 - i; j++) {
                if (rentals[j] < rentals[j + 1]) {
                    // Swap rental counts
                    int tempRental = rentals[j];
                    rentals[j] = rentals[j + 1];
                    rentals[j + 1] = tempRental;

                    // Swap corresponding genres to keep parallel alignment
                    String tempGenre = genres[j];
                    genres[j] = genres[j + 1];
                    genres[j + 1] = tempGenre;
                }
            }
        }
    }

    // Displays all genres along with their rental counts
    public static void display(String[] genres, int[] rentals){
        System.out.println("----------------------------");
        System.out.printf("%-15s %-10s\n", "Genre", "Rentals");
        System.out.println("----------------------------");
        for (int i = 0; i < genres.length; i++) {
            System.out.printf("%-15s %-10d\n", genres[i], rentals[i]);
        }
        System.out.println("----------------------------");
    }

    // Resets all rental counts to 0
    public static void resetRentals(int[] rentals){
        for (int i = 0; i < rentals.length; i++) {
            rentals[i] = 0;
        }
    }
}