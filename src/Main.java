import java.util.ArrayList;

public class UC2_TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC2: Passenger Bogie Operations\n");

        // Step 1: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display after insertion
        System.out.println("After adding bogies:");
        System.out.println(passengerBogies);

        // Step 4: Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 5: Display after removal
        System.out.println("\nAfter removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 6: Check if "Sleeper" exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie not found.");
        }

        // Step 7: Final list
        System.out.println("\nFinal bogie list:");
        System.out.println(passengerBogies);
    }
}
