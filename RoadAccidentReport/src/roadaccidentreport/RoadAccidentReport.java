package roadaccidentreport;

import java.util.Scanner;

public class RoadAccidentReport {
    public static void main(String[] args) {
        // Define city names
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        
        // Single-dimensional array for cars accidents in each city
        int[] carAccidents = new int[3];
        
        // Single-dimensional array for motorbike accidents in each city
        int[] motorbikeAccidents = new int[3];
        
        // Two-dimensional array to store total accidents for both cars and motorbikes
        int[][] totalAccidents = new int[3][2]; // 3 cities, 2 vehicle types
        
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to input accident data for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.println("Enter the number of car accidents in " + cities[i] + ": ");
            carAccidents[i] = scanner.nextInt();
            
            System.out.println("Enter the number of motorbike accidents in " + cities[i] + ": ");
            motorbikeAccidents[i] = scanner.nextInt();
            
            // Store data in the 2D array
            totalAccidents[i][0] = carAccidents[i];         // Cars
            totalAccidents[i][1] = motorbikeAccidents[i];    // Motorbikes
        }
        
        // Display the total road accident report
        System.out.println("\nRoad Accident Report:");
        int cityWithHighestAccidents = 0;
        int maxAccidents = 0;
        
        for (int i = 0; i < cities.length; i++) {
            int totalForCity = carAccidents[i] + motorbikeAccidents[i];
            System.out.println(cities[i] + ": ");
            System.out.println("  Cars: " + carAccidents[i]);
            System.out.println("  Motorbikes: " + motorbikeAccidents[i]);
            System.out.println("  Total accidents: " + totalForCity + "\n");
            
            // Check for city with the highest total number of accidents
            if (totalForCity > maxAccidents) {
                maxAccidents = totalForCity;
                cityWithHighestAccidents = i;
            }
        }
        
        // Display the city with the highest number of accidents
        System.out.println("The city with the highest number of road accidents is: " + cities[cityWithHighestAccidents] +
                           " with " + maxAccidents + " total accidents.");
        
        scanner.close();
    }
}


//REFERENCES
//Title: StudentScoreReport, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/c/66fa4167-3a74-800a-a756-d964ae7b5c4f
