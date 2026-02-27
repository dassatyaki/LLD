package Entity;

import ParkingStrategy.ParkingStrategy;
import Payment.PaymentStrategy;
import Vehicles.Vehicle;
import Gates.*;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private List<ParkingFloor> floors;
    EntryGate entryGate;
    ExitGate exitGate;

    private ParkingLot() {
        floors = new ArrayList<>();
        entryGate = new EntryGate();
        exitGate = new ExitGate();
    }

    public static ParkingLot getInstance() {
        if(parkingLot == null) {
            synchronized (ParkingLot.class) {
                if(parkingLot == null) {
                    parkingLot = new ParkingLot();
                }
            }
        }
        return parkingLot;
    }

    public void addFloor(ParkingFloor floor) {
        floors.add(floor);
    }

    public void removeFloor(ParkingFloor floor) {
        floors.remove(floor);
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public Ticket park(Vehicle vehicle, int entryTime, ParkingStrategy parkingStrategy) {
        entryGate.setParkingStrategy(parkingStrategy);
        return entryGate.park(vehicle, floors, entryTime);
    }

    public void unPark(Ticket ticket, int exitTime, PaymentStrategy paymentStrategy) {
        exitGate.unPark(ticket, exitTime, paymentStrategy);
    }

}
