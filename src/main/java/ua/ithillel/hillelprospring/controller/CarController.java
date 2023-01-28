package ua.ithillel.hillelprospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ua.ithillel.hillelprospring.model.Car;
import ua.ithillel.hillelprospring.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    public CarController() {

    }

    public List<Car> getAll() {
        return carService.getAll();
    }
}
