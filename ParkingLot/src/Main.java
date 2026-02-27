import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        ParkingSpot spot1 = new ParkingSpot(0, VehicleType.FOUR_WHEELER);
        ParkingSpot spot2 = new ParkingSpot(1, VehicleType.FOUR_WHEELER);
        ParkingSpot spot3 = new ParkingSpot(0, VehicleType.FOUR_WHEELER);
        ParkingSpot spot4 = new ParkingSpot(1, VehicleType.TWO_WHEELER);

        ParkingFloor floor1 = new ParkingFloor(0, List.of(spot1, spot2));
        ParkingFloor floor2 = new ParkingFloor(1, List.of(spot3, spot4));
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);

        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle vehicle1 = vehicleFactory.createVehicle(0, "Car");
        Vehicle vehicle2 = vehicleFactory.createVehicle(1, "Car");
        Vehicle vehicle3 = vehicleFactory.createVehicle(2, "Bike");
        ParkingStrategy parkingStrategy = new FirstParkingStrategy();

        Ticket ticket1 = parkingLot.park(vehicle3, 1, parkingStrategy);
        Ticket ticket2 = parkingLot.park(vehicle1, 1, parkingStrategy);
        Ticket ticket3 = parkingLot.park(vehicle2, 2, parkingStrategy);

        PaymentStrategy cashStrategy = new CashPayment();
        PaymentStrategy cardStrategy = new CardPayment();

        parkingLot.unPark(ticket1, 5, cashStrategy);
        parkingLot.unPark(ticket2, 10, cardStrategy);
        parkingLot.unPark(ticket3, 12, cardStrategy);
    }
}
