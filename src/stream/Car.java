package src.stream;

public class Car {
    int speed;
    int price;

    String brand;

    public Car(int speed, int price, String brand) {
        this.speed = speed;
        this.price = price;
        this.brand = brand;
    }


    @Override
    public String toString() {
        return "Car{" +
                "speed=" + this.speed +
                ", price=" + this.price +
                ", brand='" + this.brand + '\'' +
                '}';
    }
}
