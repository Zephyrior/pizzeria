package it.epicode.pizzeria.bevande;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Bevanda {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;
    @Column(nullable = false)
    private double prezzo;
}
