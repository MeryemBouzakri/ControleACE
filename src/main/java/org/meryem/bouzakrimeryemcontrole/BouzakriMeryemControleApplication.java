package org.meryem.bouzakrimeryemcontrole;

import org.meryem.bouzakrimeryemcontrole.dto.CarDto;
import org.meryem.bouzakrimeryemcontrole.service.CarService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@SpringBootApplication
public class BouzakriMeryemControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BouzakriMeryemControleApplication.class, args);
    }

    @Bean
    public CommandLineRunner Test(CarService carService) {
        return args -> {
            List<CarDto> cars = List.of(
                    CarDto.builder().model("fiat").color("rouge").matricul("A8").price(3255.00).build(),
                    CarDto.builder().model("bm").color("rouge").matricul("A8").price(3255.00).build(),
                    CarDto.builder().model("te").color("rouge").matricul("A8").price(3255.00).build(),
                    CarDto.builder().model("sdkf").color("rouge").matricul("A8").price(3255.00).build()
            );
            cars.forEach(carService::saveCar);
        };
    }
}
