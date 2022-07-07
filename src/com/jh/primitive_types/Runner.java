package com.jh.primitive_types;

import com.jh.primitive_types.info.Car;

public class Runner {

        public static void main(String[] args) {
           Car car = new Car();
           Car otherCar = new Car();
           Car.manufacturer = "Honda";
           Car.model = "NSX";
           Car.numOfDoors = 4;
           Car.fuelType = "Petrol";
           Car.fuelCapacity = "50 Litres";

           System.out.println(Car.manufacturer + " " + Car.model);
           System.out.println(Car.numOfDoors + " Doors");
           System.out.println(Car.fuelType + ", " + Car.fuelCapacity);
        }
}
