package Payment;

import Entity.Ticket;

public class Billing {
    public double calculatePrice(Ticket ticket, int exitTime) {
        return (exitTime - ticket.getEntryTime()) * ticket.getVehicle().getVehicleType().getRate();
    }
}
