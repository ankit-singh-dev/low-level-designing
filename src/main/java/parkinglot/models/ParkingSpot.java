package parkinglot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ParkingSpot {

    private Vehicle vehicle;

    private VehicleType vehicleType;

    private boolean isAvailable;

    private int price;

    public ParkingSpot(Vehicle vehicle, VehicleType vehicleType, boolean isAvailable, int price) {
        this.vehicle = vehicle;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
        this.price = price;
    }
}
