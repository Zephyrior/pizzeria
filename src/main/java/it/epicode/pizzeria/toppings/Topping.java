package it.epicode.pizzeria.toppings;

import it.epicode.pizzeria.pizze.Pizza;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Topping {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(length = 100, nullable = false)
    private String nome;

    @ManyToOne
    private Pizza pizza;
}
