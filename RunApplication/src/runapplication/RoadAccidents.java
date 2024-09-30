package runapplication;

public abstract class RoadAccidents implements IRoadAccidents {
    private String vehicleType;
    private String city;
    private int totalAccidents;

    // Constructor to initialize vehicle type, city, and accidents
    public RoadAccidents(String vehicleType, String city, int totalAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.totalAccidents = totalAccidents;
    }

    // Getters for vehicle type, city, and accidents
    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return totalAccidents;
    }
}

//REFERENCES
//Title: RunElectricityApp, Author: ChatGPT, Date:N/A, Code version: 1, Availability: https://chatgpt.com/c/66fa4167-3a74-800a-a756-d964ae7b5c4f
