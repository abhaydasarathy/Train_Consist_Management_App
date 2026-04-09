import java.util.LinkedList;

public class UC4_TrainConsist {

    public static void main(String[] args) {

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        System.out.println("🚆 TRAIN CONSIST MANAGEMENT SYSTEM - UC4");
        System.out.println("-----------------------------------------");

        // 1. Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("\n📌 Initial Train Composition:");
        displayTrain(train);

        // 2. Insert Pantry Car at position 2
        System.out.println("\n➕ Inserting 'Pantry Car' at position 2...");
        train.add(2, "Pantry Car");

        System.out.println("\n📌 After Insertion:");
        displayTrain(train);

        // 3. Remove first and last bogie
        System.out.println("\n❌ Removing first and last bogies...");
        train.removeFirst();
        train.removeLast();

        // 4. Final train composition
        System.out.println("\n📌 Final Train Composition:");
        displayTrain(train);
    }

    // Helper method to display train
    public static void displayTrain(LinkedList<String> train) {
        for (String bogie : train) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}