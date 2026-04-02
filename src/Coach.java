class Coach {
    private String coachId;
    private String coachType;


    public Coach(String coachId, String coachType) {
        this.coachId = coachId;
        this.coachType = coachType;
    }

    public String getCoachId() {
        return coachId;
    }

    public String getCoachType() {
        return coachType;
    }

    public void displayInfo() {
        System.out.println("Coach ID: " + coachId + ", Type: " + coachType);
    }
}