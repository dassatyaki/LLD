package Entity;

import Vehicles.Vehicle;

public class Ticket {
    private int entryTime;
    private ParkingFloor floor;
    private int spotId;
    private Vehicle vehicle;

    public Ticket(int entryTime, ParkingFloor floor, int spotId, Vehicle vehicle) {
        this.entryTime = entryTime;
        this.floor = floor;
        this.spotId = spotId;
        this.vehicle = vehicle;
    }

    public ParkingFloor getFloor() {
        return floor;
    }

    public int getSpotId() {
        return spotId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getEntryTime() {
        return entryTime;
    }
}
