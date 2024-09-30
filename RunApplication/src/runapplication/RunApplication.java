package runapplication;

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter the vehicle type (e.g., Car, Motorbike): ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city where the accident occurred: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total number of accidents: ");
        int totalAccidents = scanner.nextInt();

        // Instantiate the RoadAccidentReport class
        RoadAccidentReport accidentReport = new RoadAccidentReport(vehicleType, city, totalAccidents);

        // Print the accident report
        accidentReport.PrintAccidentReport();
    }
}

//REFERENCES
//Title: RunElectricityApp, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/c/66fa4167-3a74-800a-a756-d964ae7b5c4f