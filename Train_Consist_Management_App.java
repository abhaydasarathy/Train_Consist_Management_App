import java.util.Scanner;

public class WelcomePage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Welcome Banner
        System.out.println("=================================================");
        System.out.println("      🚆 TRAIN CONSIST MANAGEMENT SYSTEM 🚆      ");
        System.out.println("=================================================");
        System.out.println("      Application using Core Java & DSA          ");
        System.out.println("-------------------------------------------------\n");

        // Description
        System.out.println("Welcome!");
        System.out.println("This system helps manage train coach composition efficiently.");
        System.out.println("You can add, remove, and reorder coaches dynamically.\n");

        // Menu
        while (true) {
            System.out.println("============== MAIN MENU ==============");
            System.out.println("1. Create Train");
            System.out.println("2. Add Coach");
            System.out.println("3. Remove Coach");
            System.out.println("4. Display Train");
            System.out.println("5. Exit");
            System.out.println("======================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n🚆 Train created successfully!\n");
                    break;

                case 2:
                    System.out.println("\n➕ Coach added successfully!\n");
                    break;

                case 3:
                    System.out.println("\n❌ Coach removed successfully!\n");
                    break;

                case 4:
                    System.out.println("\n📋 Displaying train coaches...\n");
                    break;

                case 5:
                    System.out.println("\nThank you for using the system!");
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("\n⚠ Invalid choice! Try again.\n");
            }
        }
    }
}