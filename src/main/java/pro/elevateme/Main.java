package pro.elevateme;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car(); // Using the no-argument constructor
        System.out.println("Default Car: " + defaultCar);

        Car specificCar = new Car("Toyota", "Camry", 2020); // Using the parameterized constructor
        System.out.println("Specific Car: " + specificCar);
    }
}
