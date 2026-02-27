public class VehicleFactory {
    public Vehicle createVehicle(int vehicleId, String vehicle) {
        if(vehicle.equals("Car"))
            return new FourWheelerVehicle(vehicleId);
        else if(vehicle.equals("Bike"))
            return new TwoWheelerVehicle(vehicleId);
        else
            throw new RuntimeException("Invalid vehicle");
    }
}
