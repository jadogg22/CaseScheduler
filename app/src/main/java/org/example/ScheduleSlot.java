package org.example;

public class ScheduleSlot {
    private String startTime;
    private String endTime;
    private Case assignedCase;

    public ScheduleSlot(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.assignedCase = null;
    }
    public ScheduleSlot(String startTime, String endTime, Case assignedCase) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.assignedCase = assignedCase;
    }


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    } 

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Case getAssignedCase() {
        return assignedCase;
    }

}
