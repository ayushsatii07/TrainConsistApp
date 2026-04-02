import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        System.out.println("UC4: LinkedList Bogie Operations\n");

        LinkedList<String> train = new LinkedList<>();

        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        train.add(2, "Pantry Car");

        train.removeFirst();
        train.removeLast();

        System.out.println("Final Train Consist:");
        for (String bogie : train) {
            System.out.println(bogie);
        }
    }
}
