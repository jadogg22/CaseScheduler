package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Starting CaseTracker server on http://localhost:4567/report");
        ReportController.setupRoutes();
    }
}

