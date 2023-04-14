public class TaxiFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        Taxi taxi = new Taxi();
        return taxi;
    }

    @Override
    public Driver createDriver(String name) {
        if (Taxi.getDriver().getCategory() == null) {
            Taxi.getDriver().setCategory("B");
            Taxi.getDriver().setName(name);
        }
        return Taxi.getDriver();
    }
}
