package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServise;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping()
    public String list(Model model,
                       @RequestParam(required = false, name = "count", defaultValue = "5") int numberOfCars){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Model 1", 100, 40));
        cars.add(new Car("Model 2", 200, 200));
        cars.add(new Car("Model 3", 300, 10));
        cars.add(new Car("Model 4", 400, 160));
        cars.add(new Car("Model 5", 500, 180));
        CarServise carServise = new CarServise();
        List<Car> limitedListOfCars;
        if (numberOfCars > 0){
            limitedListOfCars = carServise.getLimitedNumberOfCars(cars, numberOfCars);
        } else {
            limitedListOfCars = new ArrayList<>();
        }

        model.addAttribute("cars", limitedListOfCars);
        return "cars";
    }

}
