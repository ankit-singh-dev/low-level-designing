package parkinglot.parkingstrategy;

import parkinglot.models.Ticket;

public class MinuteBasedCalculation implements PricingCalculatorStrategy{

    @Override
    public Double calculateTotalFare(Ticket ticket) {
        return 20.0;
    }
}
