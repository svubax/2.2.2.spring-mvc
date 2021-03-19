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
    public List<Car> getCars(Integer num) {
        if (num == null || num > 5 || num < 0) num = 5;
        return cars.subList(0, num);
    }
}
