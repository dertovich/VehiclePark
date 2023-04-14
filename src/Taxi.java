import java.util.ArrayList;
import java.util.List;

public class Taxi implements Vehicle {
    private List<Passenger> passengers;
    private final int maxPassengerCount;
    private static Driver driver;

    public Taxi(){
        super();
        driver = Driver.getInstance();
        passengers = new ArrayList<>();
        maxPassengerCount = 4;
    }

    public void loadPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void unloadPassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public boolean isReadyToDepart() {
        return true;
    }

    public int getMaxPassengerCount() {
        return this.maxPassengerCount;
    }

    public int getCurrentPassengerCount() {
        return passengers.size();
    }

    public static Driver getDriver() {
        return driver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Taxi Information: \n");
        sb.append("Driver: ");
        if (driver != null) {
            sb.append(driver.toString());
        } else {
            sb.append("No driver assigned");
        }
        sb.append("\nPassengers: ");
        if (!passengers.isEmpty()) {
            for (Passenger passenger : passengers) {
                sb.append(passenger.toString());
                sb.append(", ");
            }
            sb.delete(sb.length() - 2, sb.length());
        } else {
            sb.append("No passengers");
        }
        sb.append("\nCurrent Passenger Count: ");
        sb.append(passengers.size());
        sb.append("\nMax Passenger Count: ");
        sb.append(maxPassengerCount);
        return sb.toString();
    }
}
