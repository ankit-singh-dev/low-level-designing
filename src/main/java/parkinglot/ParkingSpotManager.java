package parkinglot;

import parkinglot.models.ParkingSpot;
import parkinglot.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {

    private List<ParkingSpot> parkingSpotList;

    public void initializeParkingSpots(int parkingSpots) {
        this.parkingSpotList = new ArrayList<>(parkingSpots);
    }

    public void parkTheVehicle(Vehicle vehicle) {

    }
}
