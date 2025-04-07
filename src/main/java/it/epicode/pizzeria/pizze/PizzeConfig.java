package it.epicode.pizzeria.pizze;

import it.epicode.pizzeria.toppings.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PizzeConfig {

    @Bean
    public Pizza pizzaBoscaiola() {
        Pizza pizza = new Pizza();
        pizza.setNome("Boscaiola");
        pizza.setCalorie(800);


        Topping toppingBoscaiola1 = new Topping();
        toppingBoscaiola1.setNome("Funghi");
        Topping toppingBoscaiola2 = new Topping();
        toppingBoscaiola2.setNome("Salsiccia");

        pizza.setToppings(List.of(toppingBoscaiola1, toppingBoscaiola2));
        pizza.setPrezzo(9.99);
        return pizza;
    }

}
