package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.car.CarSource;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carList(@RequestParam(required = false) Integer count, ModelMap model) {
        model.addAttribute(
                "cars",
                CarSource.getCars(count)
        );

        return "car";
    }
}
