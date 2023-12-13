package com.andylang.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student andy = new Student(
                    "Andy Lang",
                    "andy.lang@email.com",
                    LocalDate.of(2000, Month.DECEMBER, 1),
                    43
            );

            Student timo = new Student(
                    "Timo Salo",
                    "timo.salo@email.com",
                    LocalDate.of(2001, Month.JANUARY, 30),
                    51
            );

            repository.saveAll(
                    List.of(andy,timo)
            );
        };
    }
}
