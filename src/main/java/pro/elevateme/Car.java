package pro.elevateme;

public class Car {
    private String make;
    private String model;
    private int year;

    // Scenario 1: we don't define any constructor, Java provides a default no-argument constructor, that initializes fields to default values.
    // Default value for a String is null, and for int is 0.

    // Scenario 2: We define a non-parameterized or no-arguments constructor that initializes fields to specific default values.
    public Car() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Scenario 3: We define a parameterized constructor that allows setting fields during object creation with specific values.
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}
