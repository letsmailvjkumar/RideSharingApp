public class Car extends Vehicle {
    private int seatCount;
    private String carType;

    public Car(String licensePlate, String vehicleType, String vehicleId, String driver, int seatCount, String carType) {
        super(licensePlate, vehicleType, vehicleId, driver);
        this.seatCount = seatCount;
        this.carType = carType;
    }
    public int getSeatCount() {
        return seatCount;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public double calculateFare(double distance){
        double ratePerKm = 10.0;
        return baseFare(distance, ratePerKm);

    }
}
