package com.azure.demo.carstore.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class VehicleDTO {
    private String brand;
}
