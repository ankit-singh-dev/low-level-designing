package parkinglot.models;

public abstract class ParkingManager {


    public abstract boolean findParkingSpot(VehicleType vehicleType);

    public abstract ParkingSpot findNearestParkingSpot(VehicleType vehicleType);
}
