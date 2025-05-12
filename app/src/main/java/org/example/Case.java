package org.example;

public class Case{
    private String id;
    private String type;
    private int estematedTime;
    private String status;

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

    public static CaseType getRandomCaseType() {
        CaseType[] types = values();
        return types[(int) (Math.random() * types.length)];
    }
}
    public Case(String id, String type, int estematedTime, String status) {
        this.id = id;
        this.type = type;
        this.estematedTime = estematedTime;
        this.status = status;

        System.out.println("Case created with ID: " + id);
    }

    public Case(String id) {
        this.id = id;
        // select a type randomly from the enum
        CaseType myCaseType = CaseType.getRandomCaseType();
        this.type = myCaseType.name();
        this.estematedTime = myCaseType.getDefaultMinutes();
        this.status = "New";
    }
    
    public String toString(){
        return "Case ID: " + id + ", Type: " + type + ", Estimated Time: " + String.valueOf(estematedTime) + " minutes, Status: " + status;
    }
    

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
