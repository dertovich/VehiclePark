public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр фабрики автобусов
        VehicleFactory busFactory = new BusFactory();

        // Создаем автобус с водителем
        Vehicle bus = busFactory.createVehicle();
        Driver busDriver = busFactory.createDriver("John");

        // Загружаем пассажиров в автобус
        Passenger passenger1 = new Passenger("Passenger 1");
        Passenger passenger2 = new Passenger("Passenger 2");
        Passenger passenger3 = new Passenger("Passenger 3");
        bus.loadPassenger(passenger1);
        bus.loadPassenger(passenger2);
        bus.loadPassenger(passenger3);

        // Выводим информацию о состоянии автобуса
        System.out.println("Bus: " + bus.toString());

        System.out.println("-------------------------------------------------");

        // Создаем экземпляр фабрики такси
        VehicleFactory taxiFactory = new TaxiFactory();

        // Создаем такси с водителем
        Vehicle taxi = taxiFactory.createVehicle();
        Driver taxiDriver = taxiFactory.createDriver("Alice");

        // Загружаем пассажиров в такси
        Passenger passenger4 = new Passenger("Passenger 4");
        taxi.loadPassenger(passenger4);

        // Выводим информацию о состоянии такси
        System.out.println("Taxi: " + taxi.toString());
    }
}