package parkinglot.parkingstrategy;

import parkinglot.models.Ticket;

public interface PricingCalculatorStrategy {

    Double calculateTotalFare(Ticket ticket);

}
