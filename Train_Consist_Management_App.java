import java.util.LinkedHashSet;

public class UC5_OrderedUniqueBogies {

    public static void main(String[] args) {

        LinkedHashSet<String> train = new LinkedHashSet<>();

        System.out.println("🚆 TRAIN CONSIST MANAGEMENT SYSTEM - UC5");
        System.out.println("-----------------------------------------");

        // Add bogies
        System.out.println("\n📌 Adding bogies...");
        addBogie(train, "Engine");
        addBogie(train, "Sleeper");
        addBogie(train, "Cargo");
        addBogie(train, "Guard");

        // Attempt duplicate
        System.out.println("\n⚠ Attempting to add duplicate 'Sleeper'...");
        addBogie(train, "Sleeper");

        // Display
        System.out.println("\n📌 Final Train Formation (Ordered & Unique):");
        displayTrain(train);
    }

    // Method to safely add bogie
    public static void addBogie(LinkedHashSet<String> train, String bogie) {
        if (train.add(bogie)) {
            System.out.println("✅ Added: " + bogie);
        } else {
            System.out.println("❌ Duplicate ignored: " + bogie);
        }
    }

    // Display method
    public static void displayTrain(LinkedHashSet<String> train) {
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}