import java.util.Random;
import java.util.Scanner;

/**
 * AcademicPerformanceManagementApp class handles the tracking, evaluation,
 * and reporting of student academic performance, probation status, and recommendations[cite: 8].
 */
public class AcademicPerformanceManagementApp {
    // Global Scanner instance for console input collection
    static Scanner sc = new Scanner(System.in);

    /**
     * Main method orchestrating the application execution flow[cite: 12].
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // 5.2.1 Declare five parallel arrays for student data[cite: 12]
        String[] studentIDs = {"23001", "43002", "43003", "53014", "63205"};
        
        // 5.2.2 Initialise the studentIDs and courses arrays using information from Table 5.2[cite: 8, 12]
        String[] courses = {
            "Computer Science", 
            "Computer Systems", 
            "Dip Informatics", 
            "Information Technology", 
            "Dip Informatics"
        };
        int[] yearsOfStudy = new int[studentIDs.length];
        int[] failedModules = new int[studentIDs.length];
        String[] academicStatuses = new String[studentIDs.length];

        // 5.2.3 Populate the yearsOfStudy array by calling populateYearsOfStudy[cite: 9, 12]
        populateYearsOfStudy(yearsOfStudy);

        // 5.2.4 Populate the failedModules array by calling populateFailedModules[cite: 10, 12]
        populateFailedModules(studentIDs, failedModules);

        // 5.2.5 Determine the academicStatuses array by calling determineRecommendation[cite: 11, 12]
        determineRecommendation(failedModules, yearsOfStudy, academicStatuses);

        char option;
        do {
            // 5.2.6 Call/invoke the getUserOption method based on Table 5.5 options[cite: 11, 12]
            option = getUserOption();

            // 5.2.7 Use a switch statement to perform actions until exit[cite: 11, 12]
            switch (option) {
                case '1':
                case 'A':
                case 'a':
                    // Display all students in the monitoring list (Figure 5.3 format)[cite: 11, 12]
                    displayAllStudents(studentIDs, courses, yearsOfStudy, failedModules, academicStatuses);
                    break;

                case '2':
                case 'S':
                case 's':
                    // Search for a student's status using student ID[cite: 11, 12]
                    System.out.print("Enter the student ID you searching for:");
                    String searchID = sc.nextLine();
                    int index = searchStudent(searchID, studentIDs);

                    if (index == -1) {
                        // Display message if student ID is not found (Figure 5.5 format)[cite: 12]
                        System.out.println("Enter the student ID you searching for:" + searchID);
                        System.out.println("Student " + searchID + " not found.");
                    } else {
                        // Display single student details matching Figure 5.4 format[cite: 12]
                        System.out.println("Enter the student ID you searching for:" + searchID);
                        System.out.printf("%-8s %-25s %-6s %-15s %-30s%n", "Stud#", "Course", "Year", "Failed Modules", "Recomendation");
                        System.out.printf("%-8s %-25s %-6d %-15d %-30s%n", 
                            studentIDs[index], courses[index], yearsOfStudy[index], failedModules[index], academicStatuses[index]);
                        System.out.println("****************************************************************************************************");
                    }
                    break;

                case '3':
                case 'X':
                case 'x':
                    // 5.2.8 Exit program and display goodbye message (Figure 5.6 format)[cite: 12]
                    System.out.println("3");
                    System.out.println("Good Bye!!!!");
                    break;

                default:
                    // Display error message and re-display menu for any other key (Figure 5.7 format)[cite: 12]
                    System.out.println(option);
                    System.out.println("Invalid Option");
                    System.out.println("****************************************************************************************************");
                    break;
            }

        } while (option != '3' && option != 'X' && option != 'x');
    }

    /**
     * 5.4.1 populateYearsOfStudy: Populates years of study array randomly from 1 to 5 using Random class[cite: 9].
     * @param years Array storing years of study
     */
    public static void populateYearsOfStudy(int[] years) {
        Random rand = new Random();
        for (int i = 0; i < years.length; i++) {
            years[i] = rand.nextInt(5) + 1; // Generates numbers between 1 and 5 inclusive
        }
    }

    /**
     * 5.4.2 populateFailedModules: Prompts user and validates failed modules for each student[cite: 10].
     * @param studentIDs Array of student IDs
     * @param failedModules Array to store validated number of failed modules
     */
    public static void populateFailedModules(String[] studentIDs, int[] failedModules) {
        for (int i = 0; i < studentIDs.length; i++) {
            int modules;
            boolean isValid;
            do {
                System.out.print("Enter number of failed modules " + studentIDs[i] + ":");
                while (!sc.hasNextInt()) {
                    System.out.println("Invalid input. Please enter an integer from 0 to 6.");
                    sc.next();
                    System.out.print("Enter number of failed modules " + studentIDs[i] + ":");
                }
                modules = sc.nextInt();
                sc.nextLine(); // Clear input buffer

                // Validate input using validateFailedModules method[cite: 10]
                isValid = validateFailedModules(modules);
                if (!isValid) {
                    System.out.println("Invalid number of modules entered, students can fail from 0 to 6 modules");
                }
            } while (!isValid);

            failedModules[i] = modules;
        }
    }

    /**
     * 5.4.3 validateFailedModules: Checks if the number of failed modules is between 0 and 6 inclusive[cite: 10].
     * @param failedModules Number of failed modules entered
     * @return true if valid, false otherwise[cite: 10]
     */
    public static boolean validateFailedModules(int failedModules) {
        return (failedModules >= 0 && failedModules <= 6);
    }

    /**
     * 5.4.4 getUserOption: Displays menu options (Figure 5.2) and returns the user's choice[cite: 10, 11].
     * @return Character option chosen by the user
     */
    public static char getUserOption() {
        System.out.println("Select any option to start or continue:");
        System.out.println("\t1/A Display all students in the academic performance monitoring list");
        System.out.println("\t2/S Search for a students status using student ID");
        System.out.println("\t3/X Exit");
        
        String inputLine = sc.nextLine();
        if (inputLine.length() > 0) {
            return inputLine.charAt(0);
        }
        return ' ';
    }

    /**
     * 5.4.5 determineRecommendation: Determines academic status based on Table 5.1 criteria 
     * depending on year of study and failed modules[cite: 7, 11].
     * @param failedModules Array of failed modules count
     * @param yearsStudy Array of years of study
     * @param academicStatus Array to populate with corresponding recommendations
     */
    public static void determineRecommendation(int[] failedModules, int[] yearsStudy, String[] academicStatus) {
        for (int i = 0; i < failedModules.length; i++) {
            int year = yearsStudy[i];
            int fails = failedModules[i];

            // Criteria for 1st to 3rd year qualifications[cite: 7]
            if (year >= 1 && year <= 3) {
                if (fails <= 1) {
                    academicStatus[i] = "Good Standing, no recommendation required";
                } else if (fails >= 2 && fails <= 3) {
                    academicStatus[i] = "Probation and Tutoring & Academic Advising";
                } else {
                    academicStatus[i] = "Exclusion with no recommendation";
                }
            } else { 
                // Criteria for 4th to 5th year qualifications[cite: 7]
                if (fails <= 1) {
                    academicStatus[i] = "Good Standing, no recommendation required";
                } else if (fails >= 2 && fails <= 3) {
                    academicStatus[i] = "Probation and Academic Advising (if can complete in time)";
                } else {
                    academicStatus[i] = "Exclusion with no recommendation";
                }
            }
        }
    }

    /**
     * 5.4.6 searchStudent: Searches for a student ID in the studentIDs array[cite: 11].
     * @param studentID ID string to search for
     * @param studentIDs Array of student IDs
     * @return index of the student if found, or -1 if not found
     */
    public static int searchStudent(String studentID, String[] studentIDs) {
        for (int i = 0; i < studentIDs.length; i++) {
            if (studentIDs[i].equalsIgnoreCase(studentID.trim())) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 5.4.7 displayAllStudents: Displays all student details matching Figure 5.3 tabular format[cite: 11, 12].
     * @param studentIDs Array of student IDs
     * @param courses Array of student courses
     * @param yearsOfStudy Array of years of study
     * @param failedModules Array of failed modules
     * @param academicStatus Array of recommendations/statuses
     */
    public static void displayAllStudents(String[] studentIDs, String[] courses, int[] yearsOfStudy, int[] failedModules, String[] academicStatus) {
        System.out.println("****************************************************************************************************");
        System.out.printf("%-8s %-25s %-6s %-15s %-30s%n", "Stud#", "Course", "Year", "Failed Modules", "Recomendation");
        
        for (int i = 0; i < studentIDs.length; i++) {
            System.out.printf("%-8s %-25s %-6d %-15d %-30s%n", 
                studentIDs[i], courses[i], yearsOfStudy[i], failedModules[i], academicStatus[i]);
        }
        System.out.println("****************************************************************************************************");
    }
}