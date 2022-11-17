package Exercise0.model;

public class AirConditioner {
    // 8 variables
    private String identifier;
    private String name;
    private String companyName;
    private String color;
    private boolean powerOn;
    private int mode;
    private double roomTemperature;
    private double desiredTemperature;

    public AirConditioner(String identifier, String name, String companyName, String color, boolean powerOn, int mode, double roomTemperature, double desiredTemperature) {
        this.identifier = identifier;
        this.name = name;
        this.companyName = companyName;
        this.color = color;
        this.powerOn = powerOn;
        this.mode = mode;
        this.roomTemperature = roomTemperature;
        this.desiredTemperature = desiredTemperature;

        System.out.println("Instance created of class1 Air Conditioner with id " + identifier + " and name " + name);
    }

    // methods
    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    private boolean turnOn() {
        return true;
    }
}

