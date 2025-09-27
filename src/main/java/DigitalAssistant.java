
import java.util.Scanner;
import java.util.Random;

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
                case 1 ->
                    variableCasting(); // Call variable casting method
                case 2 ->
                    gradeCalculator(); // Call grade calculator method
                case 3 ->
                    forLoopExample(); // Call for-loop example method
                case 4 ->
                    guessingGame(); // Call guessing game method
                case 5 ->
                    taxCalculator(); // Call tax calculator method
                case 6 ->
                    arrayExample(); // Call array example method
                case 7 ->
                    personClassExample(); // Call Person class example method
                case 0 ->
                    exit = true;
                default ->
                    System.out.println("Invalid option. Please try again.");
            }

            if (!exit) {
                System.out.println("\nPress ENTER to continue...");
                scanner.nextLine();
            }
        }
        exit();
    }

    public static void exit() {
        try {
            scanner.close();
        } catch (Exception e) {
            System.err.println("Error closing scanner: " + e.getMessage());
        }
        System.out.println("Goodbye!");
    }

    // 1. Variable Casting2
    public static void variableCasting() {
        System.out.println("*** Variable Casting ***");
        System.out.println("Pick a number");

        double number;

        try {
            number = scanner.nextDouble();

        } catch (Exception e) {
            System.err.println("Invalid number");
            scanner.nextLine();
            return;
        }

        scanner.nextLine();
        System.out.println("Pick casting option (int / float / string)");
        String castingOption = scanner.nextLine().trim().toLowerCase();

        switch (castingOption) {
            case "int" ->
                System.out.println("Casted to " + (int) number);
            case "float" ->
                System.out.println("Casted to " + (float) number);
            case "string" ->
                System.out.println("Casted to " + "\"" + Double.toString(number) + "\"");
            default ->
                System.err.println("Invalid option");
        }
    }

    // 2. Grade Calculator with Conditional Logic
    public static void gradeCalculator() {

        System.out.println("*** Grade  Calculator ****");
        System.out.println("Enter a grade percentage");

        float grade;

        try {
            grade = scanner.nextFloat();
        } catch (Exception e) {
            System.err.println("Invalid grade");
            scanner.nextLine();
            return;
        }

        scanner.nextLine();

        if (grade > 100 || grade < 0) {
            System.err.println("Invalid grade: Grade has to be between 0 - 100");
            return;
        }

        if (grade >= 86) {
            System.out.println("You got an A");
        } else if (grade >= 76) {
            System.out.println("You got a B");
        } else if (grade >= 50) {
            System.out.println("You got a C");
        } else {
            System.out.println("You got an F");
        }
    }

    // 3. For Loop Example
    public static void forLoopExample() {
        System.out.println("*** For Loop ****");
        System.out.println("Enter a start, end and gap value");

        int start, end, gap;

        try {
            start = scanner.nextInt();
            end = scanner.nextInt();
            gap = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Invalid input");
            scanner.nextLine();
            return;
        }
        scanner.nextLine();

        if (start > end) {
            System.err.println("Ivalid ipnut: Start is greater than end");
            return;
        }

        for (int i = start; i <= end; i += gap) {
            System.out.print(i + " ");
        }

        System.out.println("");
    }

    // 4. Guessing Game with While Loop
    public static void guessingGame() {

        System.out.println("**** Guessing Game ****");
        System.out.println("Guess a number between 1 - 100");
        int userNumber = 0;

        // randomly generates a number between 0 - 99. Add 1 to make it 1 - 100. 
        Random random = new Random();
        int target = random.nextInt(100) + 1;

        while (userNumber != target) {
            try {
                userNumber = scanner.nextInt();
            } catch (Exception e) {
                System.err.println("Invalid input");
                scanner.nextLine();
                continue;
            }

            scanner.nextLine();

            if (userNumber < target) {
                System.out.println("Too low");
            } else if (userNumber > target) {
                System.out.println("Too high");
            }
        }

        System.out.println("Correct! Number is " + target);
    }

    // 5. Tax Calculator with Additional Feature
    public static void taxCalculator() {

        System.out.println("**** Tax Calculator ****");
        System.out.println("Enter a price");

        double price, taxRate, totalPrice, bankBalance;

        try {
            price = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Enter a tax rate in percentage");

            taxRate = scanner.nextDouble();
            scanner.nextLine();

            if (taxRate < 0 || taxRate > 50) {
                System.err.println("Invalid input: Tax rate must be between 0 - 50");
                return;
            }

            totalPrice = price * taxRate / 100 + price;

            System.out.println("Your total price is " + totalPrice);
            System.out.println("Enter your bank balance");

            bankBalance = scanner.nextDouble();
            scanner.nextLine();

        } catch (Exception e) {
            System.out.println("Invalid input");
            scanner.nextLine();
            return;
        }

        int quantity = (int) (bankBalance / totalPrice);

        if (quantity < 0) {
            quantity = 0;
        }

        System.out.println("You can buy " + quantity + " items");
    }

    // 6. Array Example with Min, Max, and Average
    public static void arrayExample() {

        System.out.println("***Array example****");
        System.out.println("Enter whole numbers separated by spaces, then press Enter");

        // Use next line because we don't know the how many numbers the user put in
        String userInput = scanner.nextLine();

        // Split the userInput by space
        String[] stringArray = userInput.trim().split("\\s+");
        int length = stringArray.length;
        int[] numberArray = new int[length];

        try {
            for (int i = 0; i < length; i++) {
                String str = stringArray[i];
                int number = Integer.parseInt(str);
                numberArray[i] = number;
            }
        } catch (Exception e) {
            System.err.println("Invalid input");
            return;
        }

        int min = numberArray[0];
        int max = numberArray[0];
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int current = numberArray[i];

            sum = sum + current;

            if (current > max) {
                max = current;
            }
            if (current < min) {
                min = current;
            }
        }

        double average = sum / length;

        System.out.println("Min is " + min + "  Max is " + max + "  Average is " + average);
    }

    // 7. Person Class Example with Methods and Objects
    public static void personClassExample() {
//
//        System.out.println("**** Character Creator *****");
//        System.out.println("Enter a name, age and a favorite quote");
//
//        String name = scanner.nextLine();
//        String favoriteQuote = scanner.nextLine();
//
//        int age = scanner.nextInt();
//
//        Person character = new Person(name, age, favoriteQuote);
////        character.display();
//
//        System.out.println(name + age + favoriteQuote);
//
//        // TODO: Prompt the user for a name, age, and favorite quote
//        // TODO: Create a Person object using the user's input
//        // TODO: Provide an option to update the person's information
//    }

    }

    // Person class definition
    static class Person {
        // TODO: Declare instance variables for name, age, and favorite quote
        // TODO: Create a constructor to initialize the Person object
        // TODO: Implement getters and setters for each variable
        // TODO: Override the toString method to display the person’s information
    }
}
