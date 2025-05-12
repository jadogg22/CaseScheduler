package org.example;

/**
 * Represents a court case with an ID, type, estimated time, and status.
 */
public class Case{
    private String id;
    private String type;
    private int estematedTime;
    private String status;

    /**
     * Enum of case times with their default estimated times in minutes.
     */
    public enum CaseType {
    TRAFFIC(30),
    CIVIL(90),
    CRIMINAL(150),
    FAMILY(75),
    SMALL_CLAIMS(45),
    JUVENILE(60);

    private final int defaultMinutes;

    CaseType(int defaultMinutes) {
        this.defaultMinutes = defaultMinutes;
    }

    public int getDefaultMinutes() {
        return defaultMinutes;
    }

    /**
     * Returns a random case type from the enum.
     *
     * @return A random CaseType.
     */
    public static CaseType getRandomCaseType() {
        CaseType[] types = values();
        return types[(int) (Math.random() * types.length)];
    }
}
    /**
     * Constructor for creating a Case object with specified ID, type, estimated time, and status.
     *
     * @param id            The ID of the case.
     * @param type          The type of the case.
     * @param estematedTime The estimated time for the case in minutes.
     * @param status        The status of the case.
     */
    public Case(String id, String type, int estematedTime, String status) {
        this.id = id;
        this.type = type;
        this.estematedTime = estematedTime;
        this.status = status;

        System.out.println("Case created with ID: " + id);
    }

    /**
     * Constructor for creating a Case object with a specified ID and random type, estimated time, and status.
     * status is set to "New".
     * @param id The ID of the case.
     */
    public Case(String id) {
        this.id = id;
        // select a type randomly from the enum
        CaseType myCaseType = CaseType.getRandomCaseType();
        this.type = myCaseType.name();
        this.estematedTime = myCaseType.getDefaultMinutes();
        this.status = "New";
    }
    
    /**
     * Returns a string representation of the Case object for debugging purposes.
     *
     * @return A string containing the case ID, type, estimated time, and status.
     */
    public String toString(){
        return "Case ID: " + id + ", Type: " + type + ", Estimated Time: " + String.valueOf(estematedTime) + " minutes, Status: " + status;
    }
    

    /**
     * Getters and Setters for the Case class.
     */
    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    /**
     * Sets the type of the case and updates the estimated time based on the type.
     *
     * @param type The type of the case.
     * @throws IllegalArgumentException if the type is not valid.
     */
    public void setType(String type) {
        // Check if the type is valid
        boolean isValidType = false;
        for (CaseType caseType : CaseType.values()) {
            if (caseType.name().equalsIgnoreCase(type)) {
                isValidType = true;
                this.estematedTime = caseType.getDefaultMinutes();
                break;
            }
        }
        if (!isValidType) {
            throw new IllegalArgumentException("Invalid case type: " + type);
        }
        this.type = type;
    }

    public int getEstematedTime() {
        return this.estematedTime;
    }

    public void setEstematedTime(int estematedTime) {
        this.estematedTime = estematedTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
