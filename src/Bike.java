public class Bike extends Vehicle {
    private boolean hasHelmet;

    public Bike(String licensePlate, String vehicleType, String vehicleId, String driver, boolean hasHelmet) {
        super(licensePlate, vehicleType, vehicleId, driver);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateFare(double distance){
        double ratePerKm = 5.0;
        return baseFare(distance, ratePerKm);
    }

    public boolean hasHelmet() {
        return hasHelmet;
    }

    public void setHasHelmet(boolean hasHelmet) {
        this.hasHelmet = hasHelmet;
    }
}
