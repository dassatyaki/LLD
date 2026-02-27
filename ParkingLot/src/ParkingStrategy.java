import java.util.List;

public interface ParkingStrategy {
    Ticket parkVehicle(List<ParkingFloor> floors, Vehicle vehicle, int entryTime);
}
