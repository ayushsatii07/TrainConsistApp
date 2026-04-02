import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " - " + capacity;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC7: Sorting Bogies by Capacity\n");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies (by capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}