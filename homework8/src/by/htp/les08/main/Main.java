package by.htp.les08.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Volvo", 120, 12000);
        Car car1 = new Car("Opel", 110, 10000);
        Car car2 = new Car("Nissan", 100, 8000);
        car.tryToStartCar();
        car1.tryToStartCar();
        car2.tryToStartCar();
    }
}
