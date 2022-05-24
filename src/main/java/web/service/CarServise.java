package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServise {

    public List<Car> getLimitedNumberOfCars(List<Car> cars, int number){
        try{
            return cars.subList(0, number);
        } catch (Exception e){
            return cars;
        }
    }

}
