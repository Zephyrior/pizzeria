package it.epicode.pizzeria.bevande;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreaBevandeRunner implements CommandLineRunner {

    private final BevandeRepository bevandeRepository;


    @Override
    public void run(String... args) throws Exception {
        Bevanda bevanda1 = new Bevanda();
        bevanda1.setNome("Coca Cola");
        bevanda1.setPrezzo(1.50);
        Bevanda bevanda2 = new Bevanda();
        bevanda2.setNome("Fanta");
        bevanda2.setPrezzo(1.50);

        bevandeRepository.saveAll(List.of(bevanda1, bevanda2));

    }
}
