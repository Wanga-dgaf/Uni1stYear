import java.util.Scanner;

public class SubjectLeviesApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Arrays
        String[] subjectCodes = {"CFA115D", "COH115D", "PPA115D", "WEB115D", "PPB115D", "DCT115D", "CFB115D"};
        double[] oldLevies = {323.95, 100.05, 625.75, 380.95, 850.55, 122.55, 200.99};
        double[] newLevies = new double[oldLevies.length];
        String[] levyStatus = new String[oldLevies.length];

        Scanner sc = new Scanner(System.in);

        displayLevyDetails(subjectCodes, oldLevies, newLevies, levyStatus);

        
        

        do{

            switch (getUserOption()) {
                case 'C':
                case 'c':
                    populateLevies(oldLevies, subjectCodes, newLevies);

                    determineLevyStatus(levyStatus, newLevies, oldLevies);

                    displayLevyDetails(subjectCodes, oldLevies, newLevies, levyStatus);
                    break;
                case 'S':
                case 's':
                    //sc.nextLine();
                    System.out.print("Input the subject code you want to search");
                    String search = sc.nextLine();

                    int index = searchSubjectLevy(subjectCodes, search);
                    if (index == -1) {
                        System.out.println("Invalid search");
                    } else {
                        System.out.println("Subject Code " + subjectCodes[index] + " Status:  " + levyStatus[index]);
                        }
                    break;
                default:
                    System.out.println("invalid input");
                }

                 //System.out.print("Enter 1 of the options :");
                 //String input = sc.nextLine();

        } while(getUserOption() != 'e' && getUserOption() != 'E');

    }
    
    public static void populateLevies(double[] oldLevies, String[] subjectCode, double[] newLevies){
        double levy = 0.0;
        
        for(int i = 0; i < oldLevies.length; i++){
            do{
                //Prompt user input
                System.out.print("Enter new levies for " + subjectCode[i] + ": ");
                levy = sc.nextDouble();
                sc.nextLine();
                
                if(levy < 0 || levy < oldLevies[i]){
                    System.out.println("Invalid levy amount entered, must not be negative nor less than the current levy");
                }
                
            } while(levy < 0 || levy < oldLevies[i]);

            newLevies[i] = levy;
        }
              
    }
    public static boolean validateLevies(double levyAmount, double oldLevies){
        boolean isValid = false;

        if (levyAmount < 0 || levyAmount < oldLevies) {
            isValid = true;
        }

        return isValid;
    }

    public static char getUserOption(){
        System.out.print("Enter on of the options :");
        char input = sc.next().charAt(0);
        sc.nextLine();


        return input;
    }

    public static void determineLevyStatus(String[] levyStatus, double[] newLevies, double[] oldLevies){
        double difference = 0;
       for(int i = 0; i < oldLevies.length; i++){
            difference = ((newLevies[i] - oldLevies[i]) / oldLevies[i]) * 100;
            if (difference <= 6.5){
                levyStatus[i] = "Approved " + difference;
            } else if(oldLevies[i] > newLevies[i]) {
                levyStatus[i] = "Approved";
            } else{
                levyStatus[i] = "Not approved";
            }
       } 
        
    }

    public static int searchSubjectLevy(String[] subjectCodes, String searchedSubjectLevy){
        for(int i = 0; i < subjectCodes.length; i++){
            if (subjectCodes[i].equalsIgnoreCase(searchedSubjectLevy)) {
                return i;
            }
        }
        return -1;
    }

    public static void displayLevyDetails(String[] subjectCodes, double[] oldLevies, double[] newLevies, String[] levyStatus){
            System.out.printf("%-15s %-15s %-15s %-15s%n","Subject Code", "Old Levies", "New Levies", "Levy Status");
            System.out.println("---------------------------------------------------------------");
            
            for(int i = 0; i < subjectCodes.length; i++){
                System.out.printf("%-15s %-15s %-15s %-15s%n", subjectCodes[i], oldLevies[i], newLevies[i], levyStatus[i]);
            }
    }
    
}