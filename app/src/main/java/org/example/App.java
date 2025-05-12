package org.example;

public class App {
    // This is the main method that runs when the program starts
    // It creates a new Case object and prints its ID to the console
    public static void main(String[] args) {

        // Create a new Case object with ID "1", type "Traffic", estimated time 30, and status "Open"
        Case myCase = new Case("1", "Traffic", 30, "Open"); 
        System.out.println("Case ID: " + myCase.getid());    
        Case[] randomCases = createRandomCases();
        for (Case c : randomCases) {
            System.out.println(c.toString());
        }
    }

    // A function that creates a random number of Case objects in an array
    public static Case[] createRandomCases() {
        // Generate a random number of cases between 1 and 10
        int numberOfCases = (int) (Math.random() * 10) + 1;
        Case[] cases = new Case[numberOfCases];

        for (int i = 0; i < numberOfCases; i++) {
            // Use the Case constructor that takes an ID and creates random values
            cases[i] = new Case(String.valueOf(i + 1));
        }
        return cases;
    }
}


