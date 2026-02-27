package Entity;

import Vehicles.VehicleType;

public class ParkingSpot {
    private boolean isOccupied = false;
    private int id;
    private VehicleType type;

    public ParkingSpot(int id, VehicleType type) {
        this.id = id;
        this.type = type;
    }

    public boolean getOccupancy() {
        return isOccupied;
    }

    public int getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public void freeSpot() {
        isOccupied = false;
    }

    public void occupySpot() {
        isOccupied = true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
