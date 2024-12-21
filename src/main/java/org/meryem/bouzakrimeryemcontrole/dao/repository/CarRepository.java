package org.meryem.bouzakrimeryemcontrole.dao.repository;

import org.meryem.bouzakrimeryemcontrole.dao.entities.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Voiture, Long> {

    List<Voiture> findByModel(String model);

    List<Voiture> findByModelAndPriceLessThanEqual(String model, double price);
}
