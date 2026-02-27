package ParkingStrategy;

import Entity.ParkingFloor;
import Entity.ParkingSpot;
import Entity.Ticket;
import Vehicles.Vehicle;

import java.util.List;

public class FirstParkingStrategy implements ParkingStrategy {
    @Override
    public Ticket parkVehicle(List<ParkingFloor> floors, Vehicle vehicle, int entryTime) {
        for(ParkingFloor floor : floors) {
            for (ParkingSpot spot : floor.getSpots()) {
                if (!spot.getOccupancy() && spot.getType() == vehicle.getVehicleType()) {
                    spot.occupySpot();
                    Ticket ticket = new Ticket(entryTime, floor, spot.getId(), vehicle);
                    System.out.println(vehicle.getVehicleType() + " " + vehicle.getVehicleId() + " parked at floor " + floor.getFloorNumber() + " spot " + spot.getId());
                    return ticket;
                }
            }
        }
        return null;
    }
}
