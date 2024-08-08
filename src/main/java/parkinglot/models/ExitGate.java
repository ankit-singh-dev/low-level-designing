package parkinglot.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import parkinglot.parkingstrategy.PricingCalculatorStrategy;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class ExitGate {

    private Ticket ticket;

    private PricingCalculatorStrategy pricingCalculatorStrategy;

    public ExitGate(Ticket ticket, PricingCalculatorStrategy pricingCalculatorStrategy){
        this.ticket = ticket;
        this.pricingCalculatorStrategy = pricingCalculatorStrategy;
    }

    /*
    Calculate the total fare based on duration
    Make parking spot available again
     */
    public void calculateCostAndMakeParkingSpotAvailable(){

        ticket.setEnd(new Date());
        // total duration in minutes
        ticket.setTotalDuration(260);
        ticket.setTotalPrice(pricingCalculatorStrategy.calculateTotalFare(this.ticket));

        ParkingSpot parkingSpot = this.ticket.getParkingSpot();
        parkingSpot.setAvailable(false);
        parkingSpot.setVehicle(null);
    }

}
