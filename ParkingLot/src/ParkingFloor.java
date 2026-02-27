import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;
    private int floorNumber;

    public ParkingFloor(int floorNumber, List<ParkingSpot> spots) {
        this.spots = spots;
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getSpots() {
        return spots;
    }

    public ParkingSpot getSpot(int spotId) {
        return getSpots().get(spotId);
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
