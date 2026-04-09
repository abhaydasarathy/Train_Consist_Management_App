import java.util.ArrayList;

public class UC2_PassengerBogies {

    public static void main(String[] args) {

        // Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("🚆 TRAIN CONSIST MANAGEMENT SYSTEM - UC2");
        System.out.println("-----------------------------------------");

        // 1. Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 2. Display bogies after addition
        System.out.println("\n📌 Bogies after addition:");
        displayBogies(passengerBogies);

        // 3. Remove a bogie (AC Chair)
        System.out.println("\n❌ Removing 'AC Chair'...");
        passengerBogies.remove("AC Chair");

        // 4. Display after removal
        System.out.println("\n📌 Bogies after removal:");
        displayBogies(passengerBogies);

        // 5. Check existence
        System.out.println("\n🔍 Checking if 'Sleeper' exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("✅ Sleeper bogie exists in the train.");
        } else {
            System.out.println("❌ Sleeper bogie not found.");
        }

        // Final state
        System.out.println("\n📌 Final Train Composition:");
        displayBogies(passengerBogies);
    }

    // Helper method to display bogies
    public static void displayBogies(ArrayList<String> bogies) {
        if (bogies.isEmpty()) {
            System.out.println("No bogies attached.");
        } else {
            for (String bogie : bogies) {
                System.out.print(bogie + " -> ");
            }
            System.out.println("END");
        }
    }
}