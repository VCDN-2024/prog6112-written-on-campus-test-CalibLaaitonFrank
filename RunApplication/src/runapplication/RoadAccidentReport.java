package runapplication;

public class RoadAccidentReport extends RoadAccidents {

    // Constructor to initialize vehicle type, city, and accidents
    public RoadAccidentReport(String vehicleType, String city, int totalAccidents) {
        super(vehicleType, city, totalAccidents);
    }

    // Method to print accident report
    public void PrintAccidentReport() {
        System.out.println("Accident Report:");
        System.out.println("Vehicle Type: " + getAccidentVehicleType());
        System.out.println("City: " + getCity());
        System.out.println("Total Accidents: " + getAccidentTotal());
    }
}

//REFERENCES
//Title: RunElectricityApp, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/c/66fa4167-3a74-800a-a756-d964ae7b5c4f
