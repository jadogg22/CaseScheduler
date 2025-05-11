package org.example;

public class Case{
    private String id;
    private String type;
    private int estematedTime;
    private String status;

    public Case(String id, String type, int estematedTime, String status) {
        this.id = id;
        this.type = type;
        this.estematedTime = estematedTime;
        this.status = status;
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
        return estematedTime;
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
