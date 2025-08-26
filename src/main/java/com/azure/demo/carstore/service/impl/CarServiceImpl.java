package com.azure.demo.carstore.service.impl;

import com.azure.demo.carstore.dto.VehicleDTO;
import com.azure.demo.carstore.service.CarService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@Service
public class CarServiceImpl implements CarService {

    @Value("${carstore.marcas}")
    private String vehicleList;

    public List<VehicleDTO> getVehicleList() {
        // Implementation to return list of VehicleDTO based on vehicleList
        return Arrays.stream(vehicleList.split(","))
                .map(marca -> VehicleDTO.builder().brand(marca).build())
                .toList();
    }
}
