package org.meryem.bouzakrimeryemcontrole.web;


import org.meryem.bouzakrimeryemcontrole.dto.CarDto;
import org.meryem.bouzakrimeryemcontrole.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    private final CarService carService;

    public CarGraphQLController(CarService carService) {
        this.carService = carService;
    }

    @QueryMapping
    public List<CarDto> getCarByModel(@Argument String model) {
        return carService.getCarsByModel(model);
    }

    @MutationMapping
    public CarDto saveCar(@Argument CarDto car) {
        return carService.saveCar(car);
    }
}
