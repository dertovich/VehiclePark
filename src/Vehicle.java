public interface Vehicle {

    // Метод загрузки пассажира
   void loadPassenger(Passenger passenger);

    // Метод выгрузки пассажира
    void unloadPassenger(Passenger passenger);

    // Метод проверки готовности к отправлению
    public abstract boolean isReadyToDepart();

    // Метод получения максимального количества пассажиров
    public abstract int getMaxPassengerCount();

    // Метод получения текущего количества пассажиров
    int getCurrentPassengerCount();

}