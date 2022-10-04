package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {

    public List<Car> getCarList();
    public List<Car> getLimitedNumberOfCars(List<Car> cars, int number);
    public List<Car> getLimitedList(int number);

}
