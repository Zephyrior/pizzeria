package it.epicode.pizzeria.pizze;

import it.epicode.pizzeria.toppings.Topping;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @OneToMany
    private List<Topping> toppings;
    private double prezzo;
}
