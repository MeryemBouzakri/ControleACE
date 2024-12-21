package org.meryem.bouzakrimeryemcontrole.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarDto {
    private Long id;
    private String model;
    private String color;
    private String matricul;
    private Double price;
}
