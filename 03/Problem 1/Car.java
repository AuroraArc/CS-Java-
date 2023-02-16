public class Car {
    private double fuel;
    private final double fuelEff;

    public Car(double fuel, double fuelEff) {
        this.fuel = fuel;
        this.fuelEff = fuelEff;
    }

    public double getFuelAmount() {
        return fuel;
    }

    public double getFuelEfficiency() {
        return fuelEff;
    }

    public void addFuel(double amount) {
        fuel = fuel + amount;
    }

    public void drive(double distance) {
        fuel = fuel - distance / fuelEff;
    }
}
