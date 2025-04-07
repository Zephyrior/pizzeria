package it.epicode.pizzeria.menu;


import it.epicode.pizzeria.bevande.Bevanda;
import it.epicode.pizzeria.pizze.Pizza;
import it.epicode.pizzeria.toppings.Topping;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class MenuPizze {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    private List<Pizza> pizze;

    @OneToMany
    private List<Topping> toppings;
    
    @OneToMany
    private List<Bevanda> bevande;
}
