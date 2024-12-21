package org.meryem.bouzakrimeryemcontrole.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Voiture {
    @Id
    @GeneratedValue
    private Long id;
    private String model;
    private String color;
    private String matricule;
    private Double price;
}
