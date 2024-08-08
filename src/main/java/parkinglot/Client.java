package parkinglot;

import parkinglot.models.Vehicle;
import parkinglot.models.VehicleType;

public class Client {

    public static void main(String[] args) {

        ParkingSpotManager parkingSpotManager = new ParkingSpotManager();
        parkingSpotManager.initializeParkingSpots(100);

        // park the below vehicles
        Vehicle vehicle1 = new Vehicle("TG 06 6576", VehicleType.TWO_WHEELER);
        Vehicle vehicle2 = new Vehicle("TG 06 1234", VehicleType.FOUR_WHEELER);

        parkingSpotManager.parkTheVehicle(vehicle1);
        parkingSpotManager.parkTheVehicle(vehicle2);

    }
}
