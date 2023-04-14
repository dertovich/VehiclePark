public class BusFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        Bus bus = new Bus();
        return bus;
    }

    @Override
    public Driver createDriver(String name) {
        if (Bus.getDriver().getCategory() == null) {
            Bus.getDriver().setCategory("D");
            Bus.getDriver().setName(name);
        }
        return Bus.getDriver();
    }
}
