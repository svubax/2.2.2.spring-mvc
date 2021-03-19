package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    private final List<Car> cars = Arrays.asList(
            new Car("Audi", "Blue", 220),
            new Car("Skoda", "Green", 190),
            new Car("Mazda", "Black", 230),
            new Car("Toyota", "Brown", 200),
            new Car("Nissan", "Red", 210));

    @Override
    public List<Car> getCars(int num) {
        return cars.subList(0, num);
    }
}
