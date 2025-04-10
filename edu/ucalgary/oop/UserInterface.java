package edu.ucalgary.oop;

public class UserInterface {
    void displayMenu() {
        System.out.println("1. Enter information about Disaster Victim");
        System.out.println("2. Log Inquries");
        System.out.println("3. Allocate supplies");
        System.out.println("4. View Data");
        System.out.println("5. Exit");
    }

    void start() {
        System.out.println("Welcome to the Disaster Management System!");
        while (true) {
            displayMenu();
            handleInput();
        }
    }

    void handleInput() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String choice;
    
        while (true) {
            System.out.println("Please select an option (1-4): ");
            choice = scanner.nextLine(); 
    
            if (validateInput(choice)) {
                break; 
            }
        }
    
        int number = Integer.parseInt(choice);
    
        switch (number) {
            case 1:
                System.out.println("Entering information about Disaster Victim...");
                
                break;
            case 2:
                System.out.println("Logging inquiries...");
                break;
            case 3:
                System.out.println("Would you like to allocate supplies to a location or victim");
                System.out.println("1. Allocate supplies to a location");
                System.out.println("2. Allocate supplies to a victim");
                break;
            case 4:
                System.out.println("Viewing data...");
                break;
            case 5:
                System.out.println("Exiting the application. Goodbye!");
                scanner.close();
                System.exit(0); // Exit the program
                return; 
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    
    }
    

    public static boolean validateInput(String input) {
        try {
            int number = Integer.parseInt(input);
            if (number >= 1 && number <= 5) {
                System.out.println("Valid input: " + number);
                return true;
            } else {
                System.out.println("Invalid input: Number must be between 1 and 4.");
                return false;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Not a number.");
            
            return false;
        }
    }

    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.start();
    }
}