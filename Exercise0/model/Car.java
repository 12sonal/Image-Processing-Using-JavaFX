package Exercise0.model;

public class Car {
    // Creating 8 variables
    private int id;
    private String name;
    private String year;
    private String modelName;
    private String companyName;
    private double fuel;
    private int seats;
    private int gears;

    public Car(int id, String name, String year, String modelName, String companyName, double fuel, int seats, int gears) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.modelName = modelName;
        this.companyName = companyName;
        this.fuel = fuel;
        this.seats = seats;
        this.gears = gears;

        System.out.println("Instance created of class4 Car with id " + id + " and name " + name);
    }

    // methods
    public boolean speedUp() {
        return true;
    }

    public boolean speedDown() {

        return true;
    }

    public boolean changeGear() {

        return true;
    }
//Creating 2 Nested Classes: Engine & Battery

    public class Engine {
        private String engineType;
        private double engineSize;
        private double width;
        private double height;

        public Engine(String engineType, double engineSize, double width, double height)
        {
            this.engineType = engineType;
            this.engineSize = engineSize;
            this.width =width;
            this.height = height;

            System.out.println("Instance created for Nested class1 Engine with engineType "  +engineType + " and runningCyclePerChargeInHours"   +engineSize);
        }

        private void startEngine()
        {
            System.out.println("Engine Starting");
        }
    }

    public class Battery {
        private String batteryType;
        private double runningCyclePerChargeInHours;
        private double current;
        private double voltage;

        public Battery(String batteryType, double runningCyclePerChargeInHours, double current, double voltage){
            this.batteryType = batteryType;
            this.runningCyclePerChargeInHours = runningCyclePerChargeInHours;
            this.current = current;
            this.voltage = voltage;

            System.out.println("Instance created for Nested class2 Battery with type "+batteryType + " and runningCyclePerChargeInHours" +runningCyclePerChargeInHours);

        }
    }
}
