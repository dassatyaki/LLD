package Gates;

import Entity.ParkingFloor;
import Payment.Ticket;
import ParkingStrategy.ParkingStrategy;
import Vehicles.Vehicle;

import java.util.List;

public class EntryGate {
    private ParkingStrategy parkingStrategy;

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }
    public Ticket park(Vehicle vehicle, List<ParkingFloor> floors, int entryTime) {
        Ticket ticket = parkingStrategy.parkVehicle(floors, vehicle, entryTime);

        if(ticket == null)
            throw new RuntimeException("Parking is full");

        return ticket;
    }
}
