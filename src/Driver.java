public class Driver {
    private String category;
    private String name;
    private static Driver instance;

    private Driver() {}

    // Публичный метод для получения экземпляра класса Driver
    public static synchronized Driver getInstance() {
        if (instance == null) {
            instance = new Driver();
        }
        return instance;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Driver Information: \n" +
                "Name: " + name + "\n" +
                "License Category: " + category;
    }
}
