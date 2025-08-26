package com.azure.demo.carstore.service;

import com.azure.demo.carstore.dto.VehicleDTO;

import java.util.List;

public interface CarService {
    List<VehicleDTO> getVehicleList();
}
