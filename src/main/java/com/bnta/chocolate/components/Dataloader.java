package com.bnta.chocolate.components;

import com.bnta.chocolate.models.Chocolate;
import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.ChocolateRepository;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements ApplicationRunner {

    @Autowired
    ChocolateRepository chocolateRepository;

    @Autowired
    EstateRepository estateRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Estate estate1 = new Estate("Bob", "Australia");
        estateRepository.save(estate1);

        Estate estate2 = new Estate("Jill", "India");
        estateRepository.save(estate2);

        Chocolate choco1 = new Chocolate("Cadbury", 10, estate1);
        chocolateRepository.save(choco1);

        Chocolate choco2 = new Chocolate("Lint", 20, estate1);
        chocolateRepository.save(choco2);

        Chocolate choco3 = new Chocolate("Dove", 75, estate2);
        chocolateRepository.save(choco3);

        Chocolate choco4 = new Chocolate("Dove", 40, estate2);
        chocolateRepository.save(choco4);


    }
}
