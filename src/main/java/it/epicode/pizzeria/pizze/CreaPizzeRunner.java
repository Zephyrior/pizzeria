package it.epicode.pizzeria.pizze;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreaPizzeRunner implements CommandLineRunner {

    private final PizzeRepository pizzeRepository;

    @Override
    public void run(String... args) throws Exception {
        Pizza pizza1 = new Pizza();
        pizza1.setNome("Margherita");
        pizza1.setPrezzo(6.99);

        Pizza pizza2 = new Pizza();
        pizza2.setNome("Napoletana");
        pizza2.setPrezzo(7.99);

        Pizza pizza3 = new Pizza();
        pizza3.setNome("Diavola");
        pizza3.setPrezzo(8.99);

        pizzeRepository.saveAll(List.of(pizza1, pizza2, pizza3));

    }
}
