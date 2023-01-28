package ua.ithillel.hillelprospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ithillel.hillelprospring.model.Car;
import ua.ithillel.hillelprospring.repository.CarRepository;

import java.util.List;

@Service
public class CarService {
    private CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public CarService() {

    }

    public List<Car> getAll() {
        return carRepository.getAll();
    }
}
