package ParkingStrategy;

import Entity.ParkingFloor;
import Entity.Ticket;
import Vehicles.Vehicle;

import java.util.List;

public interface ParkingStrategy {
    Ticket parkVehicle(List<ParkingFloor> floors, Vehicle vehicle, int entryTime);
}
