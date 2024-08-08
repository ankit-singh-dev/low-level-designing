package parkinglot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class EntranceGate {

    private ParkingManager parkingManager;

    private Vehicle vehicle;

    public EntranceGate(ParkingManager parkingManager, Vehicle vehicle) {
        this.parkingManager = parkingManager;
        this.vehicle = vehicle;
    }

    /*
        Check if parking spot is available or not based on vehicle Type
        Find the best parking available using appropriate strategy
        Create a ticket for the Vehicle
        Make parking spot not available
         */
    public void findParkingSpotAndPark(Vehicle vehicle){
        boolean isParkingSpotAvailable = parkingManager.findParkingSpot(vehicle.getVehicleType());
        if(!isParkingSpotAvailable){
            // no parking spot is available
            System.out.println("No parking space available for "+vehicle.toString() + " Vehicle");
            return;
        }
        ParkingSpot parkingSpot = parkingManager.findNearestParkingSpot(vehicle.getVehicleType());
        new Ticket(parkingSpot, new Date(), null, null, null);
        parkingSpot.setAvailable(false);
        parkingSpot.setVehicle(vehicle);
    }

}
