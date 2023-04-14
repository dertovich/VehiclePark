public class Driver {
    private String category;
    private String name;
    // Приватный статический экземпляр класса Driver
    private static Driver instance;

    // Приватный конструктор
    private Driver() {
        // Инициализация объекта Driver
    }

    // Публичный метод для получения экземпляра класса Driver
    public static synchronized Driver getInstance() {
        if (instance == null) {
            instance = new Driver();
        }
        return instance;
    }

    // Геттер и сеттер для поля category
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
