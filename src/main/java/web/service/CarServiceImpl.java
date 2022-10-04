package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    public List<Car> getLimitedNumberOfCars(List<Car> cars, int number){
        if (number <= 0){
            return new ArrayList<>();
        }
        try{
            return cars.subList(0, number);
        } catch (Exception e){
            return cars;
        }
    }

    public List<Car> getCarList(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model 1", 100, 40));
        cars.add(new Car("Model 2", 200, 200));
        cars.add(new Car("Model 3", 300, 10));
        cars.add(new Car("Model 4", 400, 160));
        cars.add(new Car("Model 5", 500, 180));
        return cars;
    }

    public List<Car> getLimitedList(int number){
        return getLimitedNumberOfCars(getCarList(), number);
    }

}
