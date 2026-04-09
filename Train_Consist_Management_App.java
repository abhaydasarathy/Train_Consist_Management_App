import java.util.HashMap;
import java.util.Map;

public class UC6_BogieCapacityMap {

    public static void main(String[] args) {

        // Create HashMap
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        System.out.println("🚆 TRAIN CONSIST MANAGEMENT SYSTEM - UC6");
        System.out.println("-----------------------------------------");

        // Add bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 48);

        // Display mapping
        System.out.println("\n📌 Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }
    }
}