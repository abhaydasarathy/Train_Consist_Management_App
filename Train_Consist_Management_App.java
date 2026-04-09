import java.util.HashSet;

public class UC3_UniqueBogieIDs {

    public static void main(String[] args) {

        // Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        System.out.println("🚆 TRAIN CONSIST MANAGEMENT SYSTEM - UC3");
        System.out.println("-----------------------------------------");

        // 1. Add bogie IDs (including duplicates)
        System.out.println("\n📌 Adding bogie IDs...");
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG102"); // Duplicate

        // 2. Display bogie IDs
        System.out.println("\n📌 Unique Bogie IDs in the system:");
        displayBogieIDs(bogieIDs);
    }

    // Helper method to display IDs
    public static void displayBogieIDs(HashSet<String> bogieIDs) {
        for (String id : bogieIDs) {
            System.out.println(id);
        }
    }
}