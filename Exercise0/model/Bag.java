package Exercise0.model;

public class Bag {
    // Creating 8 Variables
    private int identifier;
    private String name;
    private String companyName;
    private String Color;
    private int strips;
    private double width;
    private double height;
    private double storageCapacity;

    public Bag(int identifier, String name, String companyName, String color, int strips, double width, double height, double storageCapacity) {
        this.identifier = identifier;
        this.name = name;
        this.companyName = companyName;
        Color = color;
        this.strips = strips;
        this.width = width;
        this.height = height;
        this.storageCapacity = storageCapacity;

        System.out.println("Instance created of class2 Bag with id " + identifier + " and name " + name);
    }

    // Creating 3 methods
    private void holdBag() {

        System.out.println("Holding bag");
    }

    private void throwBag() {

        System.out.println("Throwing bag");
    }

    private void openBag() {
        System.out.println("Opening bag");
    }
}
