package Exercise0.model;

public class Clock {
    // Creating 8 variables
    private String identifier;
    private String name;
    private String modelYear;
    private String countryManufactured;
    private String currentLocation;
    private double hour;
    private double minute;
    private double second;

    public Clock(String identifier, String name, String modelYear, String countryManufactured, String currentLocation, double hour, double minute, double second) {
        this.identifier = identifier;
        this.name = name;
        this.modelYear = modelYear;
        this.countryManufactured = countryManufactured;
        this.currentLocation = currentLocation;
        this.hour = hour;
        this.minute = minute;
        this.second = second;

        System.out.println("Instance created of class6 Clock with id " + identifier + " and name " + name);
    }

    //Creating 3  methods
    private String getTime() {
        return "4:00:00";
    }

    private boolean isWorking() {

        return true;
    }

    private void getColor() {
        System.out.println("My color is black");
    }
}
