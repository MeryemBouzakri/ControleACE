package org.meryem.bouzakrimeryemcontrole.service;

import lombok.AllArgsConstructor;
import org.meryem.bouzakrimeryemcontrole.dao.entities.Voiture;
import org.meryem.bouzakrimeryemcontrole.dto.CarDto;
import org.meryem.bouzakrimeryemcontrole.mapper.CarMapper;
import org.meryem.bouzakrimeryemcontrole.dao.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    @Override
    public CarDto saveCar(CarDto carDto) {
        Voiture voiture = carMapper.toEntity(carDto);
        voiture = carRepository.save(voiture);
        return carMapper.toDTO(voiture);
    }

    @Override
    public boolean deleteCar(Long id) {
        try {
            carRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public CarDto saveVoiture(CarDto carDto) {
        return null;
    }

    @Override
    public boolean deleteVoiture(Long id) {
        return false;
    }

    @Override
    public List<CarDto> getCarsByModel(String model) {
        List<Voiture> voitures = carRepository.findByModel(model);
        List<CarDto> carDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            carDtos.add(carMapper.toDTO(voiture));
        }
        return carDtos;
    }

    @Override
    public List<CarDto> getCarsByModelAndPrice(String model, double price) {
        List<Voiture> voitures = carRepository.findByModelAndPriceLessThanEqual(model, price);
        List<CarDto> carDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            carDtos.add(carMapper.toDTO(voiture));
        }
        return carDtos;
    }

    @Override
    public List<CarDto> saveCars(List<CarDto> carDtos) {
        List<Voiture> voitures = new ArrayList<>();
        for (CarDto carDto : carDtos) {
            voitures.add(carMapper.toEntity(carDto));
        }
        voitures = carRepository.saveAll(voitures);

        List<CarDto> resultDtos = new ArrayList<>();
        for (Voiture voiture : voitures) {
            resultDtos.add(carMapper.toDTO(voiture));
        }
        return resultDtos;
    }
}
