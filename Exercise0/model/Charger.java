package Exercise0.model;

//Creating 8 variables
public class Charger {
    private int identifier;
    private String name;
    private String model;
    private String manufacturerName;
    private String manufacturerCountry;
    private String color;
    private double length;
    private double voltage;

    public Charger(int identifier, String name, String model, String manufacturerName, String manufacturerCountry, String color, double length, double voltage) {
        this.identifier = identifier;
        this.name = name;
        this.model = model;
        this.manufacturerName = manufacturerName;
        this.manufacturerCountry = manufacturerCountry;
        this.color = color;
        this.length = length;
        this.voltage = voltage;

        System.out.println("Instance created of class5 Charger with id " + identifier + " and name " + name);
    }

    // Creating 3 methods
    private void startCharging() {

    }

    private void stopCharging() {

    }

    private boolean isWorking() {
        return false;
    }
}