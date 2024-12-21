package org.meryem.bouzakrimeryemcontrole.service;

import org.meryem.bouzakrimeryemcontrole.dto.CarDto;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface CarService {
    CarDto saveCar(CarDto carDto);

    boolean deleteCar(Long id);

    CarDto saveVoiture(CarDto carDto);  // Cette méthode pourrait être une erreur si elle n'est pas définie dans l'interface

    boolean deleteVoiture(Long id);     // Pareil ici

    List<CarDto> getCarsByModel(String model);

    List<CarDto> getCarsByModelAndPrice(String model, double price);

    List<CarDto> saveCars(List<CarDto> carDtos);
}
