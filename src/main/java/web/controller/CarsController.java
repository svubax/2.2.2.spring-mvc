package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImp;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count == null || count > 5 || count < 0) count = 5;
        List<Car> cars = new CarServiceImp().getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
