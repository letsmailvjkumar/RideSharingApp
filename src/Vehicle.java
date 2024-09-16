public abstract class Vehicle {
    private String vehicleId;
    private String vehicleType;
    private String licensePlate;
    private String driver;

    public Vehicle(String licensePlate, String vehicleType, String vehicleId, String driver) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.vehicleId = vehicleId;
        this.driver = driver;
    }

    // Abstract method for calculating fare, to be implemented by child classes
    public abstract double calculateFare(double distance);

    public String getVehicleType() {
        return vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getDriver() {
        return driver;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    // common logic for fare that can be overridden
    public double baseFare(double distance, double ratePerKm) {
        return distance * ratePerKm;
    }
}
