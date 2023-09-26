package de.neuefische;

import de.neuefische.model.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "I4");
        System.out.println(car.getBrand());
        System.out.println(car);
        Car car2 = new Car("BMW", "I3");
        boolean isEqualsCar = car.equals(car2);
        System.out.println(isEqualsCar);
    }
}
