package ua.ithillel.hillelprospring.repository;

import org.springframework.stereotype.Repository;
import ua.ithillel.hillelprospring.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {
    private List<Car> cars;

    public List<Car> getAll() {
        cars = new ArrayList<>();
        cars.add(new Car("Porsche", "yellow", "SPORT"));
        cars.add(new Car("Mercedes", "silver", "SPORT"));
        cars.add(new Car("McLaren", "orange", "SPORT"));
        cars.add(new Car("Lamborghini", "purple", "SPORT"));
        cars.add(new Car("Aston Martin", "green", "SPORT"));
        cars.add(new Car("Bentley", "grey", "SPORT"));
        cars.add(new Car("BMW", "blue-white", "SPORT"));
        cars.add(new Car("Honda", "white", "SPORT"));
        cars.add(new Car("Lexus", "blue", "SPORT"));
        cars.add(new Car("Nissan", "rec", "SPORT"));
        cars.add(new Car("Chevrolet", "yellow", "SPORT"));
        return cars;
    }
}
