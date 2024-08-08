package parkinglot.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class Ticket {

    private ParkingSpot parkingSpot;

    private Date start;

    private Date end;

    private Double totalPrice;

    private Integer totalDuration;

    public Ticket(ParkingSpot parkingSpot, Date start, Date end, Double totalPrice, Integer totalDuration) {
        this.parkingSpot = parkingSpot;
        this.start = start;
        this.end = end;
        this.totalPrice = totalPrice;
        this.totalDuration = totalDuration;
    }
}
