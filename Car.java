public class Car {
    String brand;
    String model;
    int speed;

    void accelerate() {
        speed += 10;
    }

    void displayInfo() {
        System.out.println(brand + " " + model + " - " + speed + " km/h");
    }
}
