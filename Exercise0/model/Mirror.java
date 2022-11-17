package Exercise0.model;

public class Mirror {
    // 8 instances
    private int identifier;
    private String name;
    private boolean hasCracks;
    private double width;
    private double height;
    private String location;
    private boolean isClean;
    private double price;

    public Mirror(int identifier, String name, boolean hasCracks, double width, double height, String location, boolean isClean, double price) {
        this.identifier = identifier;
        this.name = name;
        this.hasCracks = hasCracks;
        this.width = width;
        this.height = height;
        this.location = location;
        this.isClean = isClean;
        this.price = price;

        System.out.println("Instance created of class9 Mirror with id " + identifier + " and name " + name);
    }

    // Creating 3 methods
    public boolean isHasCracks() {

        return hasCracks;
    }

    public String getLocation()
    {
        return "";
    }

    public boolean isClean() {

        return isClean;
    }
}

