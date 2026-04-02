import java.util.HashSet;

public class UC3_TrainApp {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC3: Unique Bogie ID Management\n");

        HashSet<String> bogieIds = new HashSet<>();

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");
        bogieIds.add("B2");
        bogieIds.add("B1");

        System.out.println("Unique Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
    }
}