package Exercise0.model;

public class Glass {
    // Creating 8 Variables
    private String id;
    private String name;
    private double width;
    private double height;
    private double volume;
    private boolean containsLiquid;
    private boolean containsSolid;
    private boolean hasHandle;

    public Glass(String id, String name, double width, double height, double volume, boolean containsLiquid, boolean containsSolid, boolean hasHandle) {
        this.id = id;
        this.name = name;
        this.width = width;
        this.height = height;
        this.volume = volume;
        this.containsLiquid = containsLiquid;
        this.containsSolid = containsSolid;
        this.hasHandle = hasHandle;

        System.out.println("Instance created of class7 Glass with id " + id + " and name " + name);
    }

    // Creating 3 methods
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean isHasHandle() {
        return hasHandle;
    }
}
