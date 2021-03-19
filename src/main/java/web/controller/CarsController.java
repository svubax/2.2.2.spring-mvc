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
        model.addAttribute("cars", new CarServiceImp().getCars(count));
        return "cars";
    }
}
