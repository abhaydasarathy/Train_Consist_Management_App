import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString() {
        return name + " → Capacity: " + capacity;
    }
}

public class UC7_SortBogies {

    public static void main(String[] args) {

        // Create List
        List<Bogie> bogies = new ArrayList<>();

        System.out.println("🚆 TRAIN CONSIST MANAGEMENT SYSTEM - UC7");
        System.out.println("-----------------------------------------");

        // Add bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 48));

        // Sort using Comparator (ascending order)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // Display sorted bogies
        System.out.println("\n📌 Bogies Sorted by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}