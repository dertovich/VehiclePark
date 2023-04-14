public class Passenger {
    private String name;

    public Passenger(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Passenger Information: \n" +
                "Passenger Name: " + name;
    }
}
