package Exercise0.model;

public class Laptop {
    // Creating 8 instance properties
    private int identifier;
    private String name;
    private String companyName;
    private String modelYear;
    private String color;
    private double price;
    private double RAM;
    private double storageSpace;

    public Laptop(int identifier, String name, String companyName, String modelYear, String color, double price, double RAM, double storageSpace) {
        this.identifier = identifier;
        this.name = name;
        this.companyName = companyName;
        this.modelYear = modelYear;
        this.color = color;
        this.price = price;
        this.RAM = RAM;
        this.storageSpace = storageSpace;

        System.out.println("Instance created of class8 Laptop with id " + identifier + " and name " + name);
    }

    // methods
    public void runVideo(int name) {
        System.out.println("Running video " + name);
    }

    public boolean restart()
    {
        System.out.println("Restarting laptop");
        return true;
    }

    public void typing() {

        System.out.println("tying");
    }

}
