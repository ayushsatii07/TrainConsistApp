import java.util.ArrayList;
import java.util.List;

class Train {
    private List<Coach> coaches;

    // Constructor
    public Train() {
        coaches = new ArrayList<>();
    }

    // Add coach
    public void addCoach(Coach coach) {
        coaches.add(coach);
        System.out.println("Coach added: " + coach.getCoachId());
    }

    // Remove coach by ID
    public void removeCoach(String coachId) {
        boolean removed = false;

        for (Coach c : coaches) {
            if (c.getCoachId().equals(coachId)) {
                coaches.remove(c);
                removed = true;
                System.out.println("Coach removed: " + coachId);
                break;
            }
        }

        if (!removed) {
            System.out.println("Coach not found!");
        }
    }

    // Display all coaches
    public void displayConsist() {
        if (coaches.isEmpty()) {
            System.out.println("Train has no coaches.");
            return;
        }

        System.out.println("=== Train Consist ===");
        for (Coach c : coaches) {
            c.displayInfo();
        }
    }

    // Get total coach count
    public int getCoachCount() {
        return coaches.size();
    }
}