package Exercise0.model;

public class MobilePhone {
    //8 properties
    private int identifier;
    private String name;
        private String companyName;
        private double batteryTimeInHours;
        private double batteryHealth;
        private String passCode;
        private int numberOfApps;private int cameras;

        public MobilePhone(int identifier, String name, String companyName, double batteryTimeInHours, double batteryHealth, String passCode, int numberOfApps, int cameras) {
            this.identifier = identifier;
            this.name = name;
            this.companyName = companyName;
            this.batteryTimeInHours = batteryTimeInHours;
            this.batteryHealth = batteryHealth;
            this.passCode = passCode;
            this.numberOfApps = numberOfApps;
            this.cameras = cameras;

            System.out.println("Instance created of class10 MobilePhone with id " + identifier + " and name " + name);
        }

        // 3 methods
        private void startGame(String name) {
            System.out.println("Game started " + name);
        }

        private double getBatteryHealth() {

            return 90;
        }

        private boolean open(String passcode) {
            System.out.println("if passcode matched then return true else return false");
            return true;
        }
}
