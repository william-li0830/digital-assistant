
import java.util.Scanner;

/**
 *
 * @author willi
 */
public class DigitalAssistant {

    static Scanner scanner = new Scanner(System.in);

    // Main method: Starts the program and displays the menu
    public static void main(String[] args) {
        boolean exit = false; // Boolean to control the menu loop
        // Main menu loop
        while (!exit) {
            System.out.println("Choose an option:");
            System.out.println("1. Variable casting");
            System.out.println("2. Grade calculator");
            System.out.println("3. For loop program");
            System.out.println("4. Guessing game (While loop)");
            System.out.println("5. Tax calculator");
            System.out.println("6. Array min, max, and average");
            System.out.println("7. Person class example");
            System.out.println("0. Exit");

            int choice = scanner.nextInt(); // Get the user's choice
            scanner.nextLine(); // consume the leftover newline

            // Switch case to handle menu options
            switch (choice) {
                case 1:
                    variableCasting(); // Call variable casting method
                    break;
                case 2:
                    gradeCalculator(); // Call grade calculator method
                    break;
                case 3:
                    forLoopExample(); // Call for-loop example method
                    break;
                case 4:
                    guessingGame(); // Call guessing game method
                    break;
                case 5:
                    taxCalculator(); // Call tax calculator method
                    break;
                case 6:
                    arrayExample(); // Call array example method
                    break;
                case 7:
                    personClassExample(); // Call Person class example method
                    break;
                case 0:
                    exit = true; // Exit the program
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println("\nDo you want to return to the main menu? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("no") || response.equals("n")) {
                scanner.close();
                exit = true;
                System.out.println("Goodbye!");
            }
        }
    }

    // 1. Variable Casting
    public static void variableCasting() {
        System.out.println("*** Variable Casting ***");
        System.out.println("Pick a number");
        
        if (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.println("Invalid number");
            return;
        }
        
        double number = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pick casting option (int / float / string)");
        String castingOption = scanner.nextLine().trim().toLowerCase();

        switch (castingOption) {
            case "int":
                System.out.println("Casted to " + (int) number);
                break;
            case "float":
                System.out.println("Casted to " + (float) number);
                break;
            case "string":
                System.out.println("Casted to " + "\"" + Double.toString(number) + "\"" );
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    // 2. Grade Calculator with Conditional Logic
    public static void gradeCalculator() {
        // TODO: Prompt the user for a grade percentage
        // TODO: Use conditional logic to display feedback based on grade
    }

    // 3. For Loop Example
    public static void forLoopExample() {
        // TODO: Prompt the user for a start, end, and gap value
        // TODO: Use a for-loop to print numbers incremented by the gap
    }

    // 4. Guessing Game with While Loop
    public static void guessingGame() {
        // TODO: Generate a random number between 1 and 100
        // TODO: Use a while loop to ask the user to guess the number
        // TODO: Provide feedback (too high/too low) until they guess correctly
    }

    // 5. Tax Calculator with Additional Feature
    public static void taxCalculator() {
        // TODO: Prompt the user for the price and tax rate
        // TODO: Calculate total price with tax
        // TODO: Prompt the user for their bank balance and calculate how many items they can afford
    }

    // 6. Array Example with Min, Max, and Average
    public static void arrayExample() {
        // TODO: Allow the user to input multiple values into an array
        // TODO: Implement logic to find the minimum, maximum, and average values
    }

    // 7. Person Class Example with Methods and Objects
    public static void personClassExample() {
        // TODO: Prompt the user for a name, age, and favorite quote
        // TODO: Create a Person object using the user's input
        // TODO: Provide an option to update the person's information
    }

    // Person class definition
    static class Person {
        // TODO: Declare instance variables for name, age, and favorite quote
        // TODO: Create a constructor to initialize the Person object
        // TODO: Implement getters and setters for each variable
        // TODO: Override the toString method to display the person’s information
    }
}
