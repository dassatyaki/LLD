public enum VehicleType {
    TWO_WHEELER(10.0),
    FOUR_WHEELER(20.0);

    final double rate;
    VehicleType(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }
}
