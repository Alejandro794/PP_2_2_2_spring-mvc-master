package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.service.CarService;
import web.service.CarServiceImpl;


@Controller
public class CarController {
    CarService carService = new CarServiceImpl();
    @GetMapping("/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false, defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCars(carService.getCarsList(), count));
        return "car";
    }
}
