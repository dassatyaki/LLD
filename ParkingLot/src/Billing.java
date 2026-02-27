public class Billing {
    public double calculatePrice(Ticket ticket, int exitTime) {
        return (exitTime - ticket.getEntryTime()) * ratePerHour(ticket);
    }

    public double ratePerHour(Ticket ticket) {
        Vehicle vehicle = ticket.getVehicle();
        VehicleType vehicleType = vehicle.getVehicleType();

        double rate = 0.0;

        switch(vehicleType) {
            case TWO_WHEELER -> {
                rate = 10.0;
            }

            case FOUR_WHEELER -> {
                rate = 20.0;
            }
        }
        return rate;
    }
}
