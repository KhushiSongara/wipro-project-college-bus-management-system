public class CollegeBusManagementSystem1 {

    public interface BusOperations {
        void displayBusInfo();
    }

    public static class Bus implements BusOperations {
        public String busNumber;
        public String driverName;

        public Bus(String busNumber, String driverName) {
            this.busNumber = busNumber;
            this.driverName = driverName;
        }

        public String getBusNumber() {
            return busNumber;
        }

        public String getDriverName() {
            return driverName;
        }

        public void displayBusInfo() {
            System.out.println("Bus Number: " + busNumber);
            System.out.println("Driver Name: " + driverName);
        }
    }

    public static class CollegeBus extends Bus {
        private String routeName;

        public CollegeBus(String busNumber, String driverName, String routeName) {
            super(busNumber, driverName);
            this.routeName = routeName;
        }

        public String getRouteName() {
            return routeName;
        }

        public void displayCollegeBusInfo() {
            displayBusInfo();
            System.out.println("Route Name: " + routeName);
        }
    }

    public static void main(String[] args) {
        CollegeBus collegeBus1 = new CollegeBus("G-3", "Jitu Bhaiya", "Bada Ganpati");
       CollegeBus collegeBus2 = new CollegeBus("G-56", "Gajju Bhaiya", "60 feet");

        System.out.println("College Bus Info:");
        collegeBus1.displayCollegeBusInfo();
		System.out.println();
		
		System.out.println("College Bus Info:");
        collegeBus2.displayCollegeBusInfo();

    }
}
