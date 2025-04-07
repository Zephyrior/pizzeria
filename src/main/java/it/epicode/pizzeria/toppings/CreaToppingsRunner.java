package it.epicode.pizzeria.toppings;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class CreaToppingsRunner implements CommandLineRunner {

    private final ToppingRepository toppingRepository;

    @Override
    public void run(String... args) throws Exception {
        Topping topping1 = new Topping();
        topping1.setNome("Mozzarella");
        Topping topping2 = new Topping();
        topping2.setNome("Pomodoro");
        Topping topping3 = new Topping();
        topping3.setNome("Basilico");
        Topping topping4 = new Topping();
        topping4.setNome("Prosciutto");
        Topping topping5 = new Topping();
        topping5.setNome("Pancetta");

        toppingRepository.saveAll(List.of(topping1, topping2, topping3, topping4, topping5));
    }
}
