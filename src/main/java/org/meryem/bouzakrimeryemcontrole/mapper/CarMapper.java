package org.meryem.bouzakrimeryemcontrole.mapper;




import org.meryem.bouzakrimeryemcontrole.dto.CarDto;
import org.meryem.bouzakrimeryemcontrole.dao.entities.Voiture;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public CarDto toDTO(Voiture car) {
        return modelMapper.map(car, CarDto.class);
    }

    public Voiture toEntity(CarDto carDTO) {
        return modelMapper.map(carDTO, Voiture.class);
    }
}

