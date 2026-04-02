import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC5: Ordered Unique Bogie Formation\n");

        LinkedHashSet<String> train = new LinkedHashSet<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        train.add("Sleeper");

        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}