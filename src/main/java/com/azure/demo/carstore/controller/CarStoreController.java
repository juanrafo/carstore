package com.azure.demo.carstore.controller;


import com.azure.demo.carstore.dto.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarStoreController {

    private final List<CarDTO> cars = new ArrayList<>();

    @GetMapping
    public List<CarDTO> listCars() {
        return cars;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CarDTO createCar(@RequestBody CarDTO car) {
        cars.add(car);
        return car;
    }
}
