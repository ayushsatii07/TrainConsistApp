import java.util.*;

class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC12: Safety Validation using Streams\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));

        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        if (isSafe) {
            System.out.println("Train is safety compliant");
        } else {
            System.out.println("Train is NOT safe");
        }
    }
}