package parkinglot.parkingstrategy;

import parkinglot.models.Ticket;

public class HourBased implements PricingCalculatorStrategy{
    @Override
    public Double calculateTotalFare(Ticket ticket) {
        return 40.0;
    }
}
